package pedidos;

import adaptadores.AdaptadorDolares;
import adaptadores.ConversorDivisa;
import adaptadores.SistemaConversionDolares;
import servicios.Servicio;
import servicios.ServicioEstandar;
import servicios.ServicioExpress;

/**
 * Clase que representa un pedido de servicio de env�o. Representa a Client
 *
 * @author Roberto Garc�a
 */
public class Pedido {

    private final double distancia;
    private final double tiempoEstimado;
    private final Servicio servicio;
    private final CostoContext costoStrategies;
    private final String divisa;
    private double costoTotal = 0.0;

    /**
     * Constructor de la clase Pedido.
     *
     * @param tipoServicio el tipo de servicio (Estandar o Express).
     * @param tamanoPaquete el tama�o del paquete (Sobre, Peque�o, Mediano o
     * Grande).
     * @param distancia la distancia del env�o.
     * @param divisa la divisa en la que se calcula el costo.
     */
    public Pedido(String tipoServicio, String tamanoPaquete, double distancia, String divisa) {
        this.distancia = distancia;
        this.divisa = divisa;
        servicio = tipoServicio.equals("Estandar") ? new ServicioEstandar() : new ServicioExpress();
        costoStrategies = new CostoContext();
        costoStrategies.setPaquete(servicio.crearPaquete(tamanoPaquete));
        costoStrategies.setVehiculo(servicio.crearVehiculo(tamanoPaquete, distancia));
        tiempoEstimado = costoStrategies.getTiempoEstimado(distancia);
    }

    /**
     * Calcula el costo total del pedido sumando los costos del paquete y del
     * servicio.
     *
     * @return el costo total del pedido.
     */
    private double calcularTotal() {
        costoTotal += costoStrategies.calcularCostoTotal(distancia);
        costoTotal += servicio.getCosto();
        return costoTotal;
    }

    /**
     * Calcula el costo total en d�lares utilizando el adaptador de conversi�n
     * de divisas.
     *
     * @return el costo total en d�lares.
     */
    private double calcularTotalEnDolares() {
        ConversorDivisa adaptador = new AdaptadorDolares(new SistemaConversionDolares());
        double totalEnDolares = adaptador.convertirADolares(calcularTotal());
        return totalEnDolares;
    }

    /**
     * Muestra informaci�n sobre el pedido, incluyendo el costo y el tiempo
     * estimado de entrega.
     */
    public void getPedido() {
        System.out.println(String.format("\nEl costo del servicio es $%.2f, se entregar� en %s en un tiempo aproximado de %.0f minutos.",
                divisa.equals("Pesos") ? calcularTotal() : calcularTotalEnDolares(),
                costoStrategies.getTipoAuto(),
                tiempoEstimado));
    }
}
