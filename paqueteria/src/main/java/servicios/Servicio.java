package servicios;

import paquetes.*;
import vehiculos.VehiculoStrategy;

/**
 * Clase abstracta que define un servicio de entrega. Permite crear paquetes de
 * diferentes tama�os y define m�todos abstractos para crear veh�culos y
 * calcular costos. Representa a Creator
 *
 * @author Roberto Garc�a
 */
public abstract class Servicio {

    /**
     * Crea un paquete basado en el tama�o especificado.
     *
     * @param tamano el tama�o del paquete.
     * @return un objeto {@code PaqueteStrategy} correspondiente al tama�o.
     * @throws IllegalArgumentException si el tama�o no coincide con ninguna
     * opci�n.
     */
    public PaqueteStrategy crearPaquete(String tamano) {
        return switch (tamano) {
            case "Sobre" ->
                new Sobre();
            case "Peque�o" ->
                new Pequeno();
            case "Mediano" ->
                new Mediano();
            case "Grande" ->
                new Grande();
            default ->
                throw new IllegalArgumentException("El tama�o no coincide con ninguna de las opciones");
        };
    }

    /**
     * M�todo abstracto para crear un veh�culo basado en el paquete y la
     * distancia.
     *
     * @param paquete el tama�o del paquete.
     * @param distancia la distancia en kil�metros.
     * @return un objeto {@code VehiculoStrategy} correspondiente al veh�culo
     * creado.
     */
    public abstract VehiculoStrategy crearVehiculo(String paquete, double distancia);

    /**
     * M�todo abstracto para obtener el costo del servicio.
     *
     * @return el costo del servicio como {@code double}.
     */
    public abstract double getCosto();
}
