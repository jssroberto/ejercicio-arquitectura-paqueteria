package paquetes;

/**
 * Representa un paquete de tipo mediano con un tama�o y costo espec�ficos.
 * Implementa la interfaz {@code PaqueteStrategy}.
 * Representa una ConcreteStrategy y un ConcreteProduct.
 *
 * @author Roberto Garc�a
 */
public class Mediano implements PaqueteStrategy {

    /**
     * Devuelve el tama�o del paquete.
     *
     * @return el tama�o del paquete como {@code String}.
     */
    @Override
    public String getTamano() {
        return "Mediano";
    }

    /**
     * Devuelve el costo del paquete.
     *
     * @return el costo del paquete como {@code double}.
     */
    @Override
    public double getCosto() {
        return 20.0;
    }
    
}
