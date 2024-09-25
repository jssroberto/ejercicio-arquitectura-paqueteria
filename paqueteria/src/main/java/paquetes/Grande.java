package paquetes;

/**
 * Representa un paquete de tipo grande con un tama�o y costo espec�ficos.
 * Implementa la interfaz {@code PaqueteStrategy}.
 * Representa una ConcreteStrategy y un ConcreteProduct.
 *
 * @author Roberto Garc�a
 */
public class Grande implements PaqueteStrategy {

    /**
     * Devuelve el tama�o del paquete.
     *
     * @return el tama�o del paquete como {@code String}.
     */
    @Override
    public String getTamano() {
        return "Grande";
    }

    /**
     * Devuelve el costo del paquete.
     *
     * @return el costo del paquete como {@code double}.
     */
    @Override
    public double getCosto() {
        return 50.0;
    }
    
}
