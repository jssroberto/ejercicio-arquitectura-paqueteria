package servicios;

import vehiculos.Auto;
import vehiculos.Dron;
import vehiculos.Moto;
import vehiculos.VehiculoStrategy;

/**
 * Clase que representa un servicio de entrega exprés. Esta clase extiende la
 * clase abstracta {@code Servicio} y define la creación de vehículos y el costo
 * del servicio. Representa un ConcreteCreator
 *
 * @author Roberto García
 */
public class ServicioExpress extends Servicio {

    /**
     * Crea un vehículo basado en el tamaño del paquete y la distancia.
     *
     * @param paquete el tamaño del paquete.
     * @param distancia la distancia en kilómetros.
     * @return un objeto {@code VehiculoStrategy} correspondiente al vehículo
     * creado.
     */
    @Override
    public VehiculoStrategy crearVehiculo(String paquete, double distancia) {
        if (paquete.equals("Grande")) {
            return new Auto();
        } else if ((paquete.equals("Mediano") || distancia > 5.0) || distancia > 1.0) {
            return new Moto();
        } else {
            return new Dron();
        }
    }

    /**
     * Obtiene el costo del servicio exprés.
     *
     * @return el costo del servicio como {@code double}.
     */
    @Override
    public double getCosto() {
        return 50.0;
    }

}
