package servicios;

import paquetes.*;
import vehiculos.VehiculoStrategy;

/**
 * Clase abstracta que define un servicio de entrega. Permite crear paquetes de
 * diferentes tamaños y define métodos abstractos para crear vehículos y
 * calcular costos. Representa a Creator
 *
 * @author Roberto García
 */
public abstract class Servicio {

    /**
     * Crea un paquete basado en el tamaño especificado.
     *
     * @param tamano el tamaño del paquete.
     * @return un objeto {@code PaqueteStrategy} correspondiente al tamaño.
     * @throws IllegalArgumentException si el tamaño no coincide con ninguna
     * opción.
     */
    public PaqueteStrategy crearPaquete(String tamano) {
        return switch (tamano) {
            case "Sobre" ->
                new Sobre();
            case "Pequeño" ->
                new Pequeno();
            case "Mediano" ->
                new Mediano();
            case "Grande" ->
                new Grande();
            default ->
                throw new IllegalArgumentException("El tamaño no coincide con ninguna de las opciones");
        };
    }

    /**
     * Método abstracto para crear un vehículo basado en el paquete y la
     * distancia.
     *
     * @param paquete el tamaño del paquete.
     * @param distancia la distancia en kilómetros.
     * @return un objeto {@code VehiculoStrategy} correspondiente al vehículo
     * creado.
     */
    public abstract VehiculoStrategy crearVehiculo(String paquete, double distancia);

    /**
     * Método abstracto para obtener el costo del servicio.
     *
     * @return el costo del servicio como {@code double}.
     */
    public abstract double getCosto();
}
