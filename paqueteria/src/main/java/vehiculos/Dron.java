package vehiculos;

/**
 * Representa un veh�culo de tipo dron con costos y tiempos estimados de entrega.
 * Implementa la interfaz {@code VehiculoStrategy}.
 * Representa una ConcreteStrategy y un ConcreteProduct.
 *
 * @author Roberto Garc�a
 */
public class Dron implements VehiculoStrategy {

    /**
     * Devuelve el tipo de veh�culo.
     *
     * @return el tipo de veh�culo como {@code String}.
     */
    @Override
    public String getTipo() {
        return "Dron";
    }

    /**
     * Devuelve el costo del veh�culo.
     *
     * @return el costo del veh�culo como {@code double}.
     */
    @Override
    public double getCosto() {
        return 20.0;
    }

    /**
     * Calcula el tiempo estimado de entrega basado en la distancia.
     *
     * @param distancia la distancia en kil�metros.
     * @return el tiempo estimado en minutos como {@code double}.
     */
    @Override
    public double getTiempoEstimado(double distancia) {
        return (distancia / 60.0) * 60;
    }
}
