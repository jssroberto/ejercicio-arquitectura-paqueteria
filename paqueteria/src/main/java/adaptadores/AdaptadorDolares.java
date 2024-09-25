package adaptadores;

/**
 * Adaptador para convertir cantidades a dólares utilizando el sistema de
 * conversión de dólares. Representa a Adapter.
 *
 * @author Roberto García
 */
public class AdaptadorDolares implements ConversorDivisa {

    private final SistemaConversionDolares sistemaConversionDolares;

    /**
     * Constructor de la clase que inicializa el sistema de conversión de
     * dólares.
     *
     * @param sistemaConversionDolares instancia del sistema de conversión de
     * dólares.
     */
    public AdaptadorDolares(SistemaConversionDolares sistemaConversionDolares) {
        this.sistemaConversionDolares = sistemaConversionDolares;
    }

    /**
     * Convierte una cantidad a dólares utilizando el sistema de conversión.
     *
     * @param cantidad la cantidad a convertir.
     * @return la cantidad convertida a dólares como {@code double}.
     */
    @Override
    public double convertirADolares(double cantidad) {
        return sistemaConversionDolares.convertir(cantidad);
    }

}
