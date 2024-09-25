package servicios;

import vehiculos.Auto;
import vehiculos.Bicicleta;
import vehiculos.VehiculoStrategy;

/**
 * Clase que representa un servicio de entrega est�ndar. Esta clase extiende la
 * clase abstracta {@code Servicio} y define la creaci�n de veh�culos y el costo
 * del servicio. Representa un ConcreteCreator
 *
 * @author Roberto Garc�a
 */
public class ServicioEstandar extends Servicio {

    /**
     * Crea un veh�culo basado en el tama�o del paquete y la distancia.
     *
     * @param paquete el tama�o del paquete.
     * @param distancia la distancia en kil�metros.
     * @return un objeto {@code VehiculoStrategy} correspondiente al veh�culo
     * creado.
     */
    @Override
    public VehiculoStrategy crearVehiculo(String paquete, double distancia) {
        if (paquete.equals("Grande")) {
            return new Auto();
        } else {
            return new Bicicleta();
        }
    }

    /**
     * Obtiene el costo del servicio est�ndar.
     *
     * @return el costo del servicio como {@code double}.
     */
    @Override
    public double getCosto() {
        return 30.0;
    }

}
