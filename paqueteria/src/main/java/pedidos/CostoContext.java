package pedidos;

import paquetes.PaqueteStrategy;
import vehiculos.VehiculoStrategy;

/**
 * Clase que calcula el costo total de un servicio de entrega, incluyendo el
 * costo del paquete y del vehículo, así como los costos adicionales basados en
 * la distancia. Representa a Context
 *
 * @author Roberto García
 */
public class CostoContext {

    private PaqueteStrategy paquete;
    private VehiculoStrategy vehiculo;

    /**
     * Establece el paquete para el cálculo de costo.
     *
     * @param paquete el paquete a establecer.
     */
    public void setPaquete(PaqueteStrategy paquete) {
        this.paquete = paquete;
    }

    /**
     * Establece el vehículo para el cálculo de costo.
     *
     * @param vehiculo el vehículo a establecer.
     */
    public void setVehiculo(VehiculoStrategy vehiculo) {
        this.vehiculo = vehiculo;
    }

    /**
     * Obtiene el tiempo estimado de entrega basado en la distancia.
     *
     * @param distancia la distancia en kilómetros.
     * @return el tiempo estimado en minutos como {@code double}.
     */
    public double getTiempoEstimado(double distancia) {
        return vehiculo.getTiempoEstimado(distancia);
    }

    /**
     * Obtiene el tamaño del paquete.
     *
     * @return el tamaño del paquete como {@code String}.
     */
    public String getTamanoPaquete() {
        return paquete.getTamano();
    }

    /**
     * Obtiene el tipo de vehículo utilizado.
     *
     * @return el tipo de vehículo como {@code String}.
     */
    public String getTipoAuto() {
        return vehiculo.getTipo();
    }

    /**
     * Calcula el costo sin incluir el costo del tipo de servicio.
     *
     * @return el costo total sin servicio como {@code double}.
     */
    private double getCostoSinServicio() {
        return paquete.getCosto() + vehiculo.getCosto();
    }

    /**
     * Calcula el costo adicional por distancia recorrida.
     *
     * @param distancia la distancia en kilómetros.
     * @return el costo adicional como {@code double}.
     */
    private double getCostoPorDistancia(double distancia) {
        if (distancia > 10.0) {
            return (distancia - 10.0) * 5;
        }
        return 0.0;
    }

    /**
     * Calcula el costo total del servicio de entrega.
     *
     * @param distancia la distancia en kilómetros.
     * @return el costo total como {@code double}.
     */
    public double calcularCostoTotal(double distancia) {
        return getCostoSinServicio() + getCostoPorDistancia(distancia);
    }
}
