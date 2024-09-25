package vehiculos;

/**
 * Representa un vehículo de tipo bicicleta con costos y tiempos estimados de entrega.
 * Implementa la interfaz {@code VehiculoStrategy}.
 * Representa una ConcreteStrategy y un ConcreteProduct.
 *
 * @author Roberto García
 */
public class Bicicleta implements VehiculoStrategy {

    /**
     * Devuelve el tipo de vehículo.
     *
     * @return el tipo de vehículo como {@code String}.
     */
    @Override
    public String getTipo() {
        return "Bicicleta";
    }

    /**
     * Devuelve el costo del vehículo.
     *
     * @return el costo del vehículo como {@code double}.
     */
    @Override
    public double getCosto() {
        return 5.0;
    }

    /**
     * Calcula el tiempo estimado de entrega basado en la distancia.
     *
     * @param distancia la distancia en kilómetros.
     * @return el tiempo estimado en minutos como {@code double}.
     */
    @Override
    public double getTiempoEstimado(double distancia) {
        return (distancia / 20.0) * 60;
    }
}

