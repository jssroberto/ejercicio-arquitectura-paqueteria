package vehiculos;

/**
 * Interfaz que define el comportamiento de los vehículos en el sistema de entrega.
 * Proporciona métodos para obtener el tipo, costo y tiempo estimado de entrega.
 * Representa a Strategy y Product.
 *
 * @author Roberto García
 */
public interface VehiculoStrategy {
    
    /**
     * Devuelve el tipo de vehículo.
     *
     * @return el tipo de vehículo como {@code String}.
     */
    public String getTipo();

    /**
     * Devuelve el costo del vehículo.
     *
     * @return el costo del vehículo como {@code double}.
     */
    public double getCosto();

    /**
     * Calcula el tiempo estimado de entrega basado en la distancia.
     *
     * @param distancia la distancia en kilómetros.
     * @return el tiempo estimado en minutos como {@code double}.
     */
    public double getTiempoEstimado(double distancia);
}
