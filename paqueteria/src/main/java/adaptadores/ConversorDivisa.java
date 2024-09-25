package adaptadores;

/**
 * Interfaz para la conversión de divisas a dólares. Representa a Target
 *
 * @author Roberto García
 */
public interface ConversorDivisa {

    /**
     * Convierte una cantidad a dólares.
     *
     * @param cantidad la cantidad a convertir.
     * @return la cantidad convertida a dólares como {@code double}.
     */
    public double convertirADolares(double cantidad);
}
