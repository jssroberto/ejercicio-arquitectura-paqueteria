package vehiculos;

/**
 * Interfaz que define el comportamiento de los veh�culos en el sistema de entrega.
 * Proporciona m�todos para obtener el tipo, costo y tiempo estimado de entrega.
 * Representa a Strategy y Product.
 *
 * @author Roberto Garc�a
 */
public interface VehiculoStrategy {
    
    /**
     * Devuelve el tipo de veh�culo.
     *
     * @return el tipo de veh�culo como {@code String}.
     */
    public String getTipo();

    /**
     * Devuelve el costo del veh�culo.
     *
     * @return el costo del veh�culo como {@code double}.
     */
    public double getCosto();

    /**
     * Calcula el tiempo estimado de entrega basado en la distancia.
     *
     * @param distancia la distancia en kil�metros.
     * @return el tiempo estimado en minutos como {@code double}.
     */
    public double getTiempoEstimado(double distancia);
}
