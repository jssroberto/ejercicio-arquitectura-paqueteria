package adaptadores;

/**
 * Interfaz para la conversi�n de divisas a d�lares. Representa a Target
 *
 * @author Roberto Garc�a
 */
public interface ConversorDivisa {

    /**
     * Convierte una cantidad a d�lares.
     *
     * @param cantidad la cantidad a convertir.
     * @return la cantidad convertida a d�lares como {@code double}.
     */
    public double convertirADolares(double cantidad);
}
