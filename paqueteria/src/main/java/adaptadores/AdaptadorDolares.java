package adaptadores;

/**
 * Adaptador para convertir cantidades a d�lares utilizando el sistema de
 * conversi�n de d�lares. Representa a Adapter.
 *
 * @author Roberto Garc�a
 */
public class AdaptadorDolares implements ConversorDivisa {

    private final SistemaConversionDolares sistemaConversionDolares;

    /**
     * Constructor de la clase que inicializa el sistema de conversi�n de
     * d�lares.
     *
     * @param sistemaConversionDolares instancia del sistema de conversi�n de
     * d�lares.
     */
    public AdaptadorDolares(SistemaConversionDolares sistemaConversionDolares) {
        this.sistemaConversionDolares = sistemaConversionDolares;
    }

    /**
     * Convierte una cantidad a d�lares utilizando el sistema de conversi�n.
     *
     * @param cantidad la cantidad a convertir.
     * @return la cantidad convertida a d�lares como {@code double}.
     */
    @Override
    public double convertirADolares(double cantidad) {
        return sistemaConversionDolares.convertir(cantidad);
    }

}
