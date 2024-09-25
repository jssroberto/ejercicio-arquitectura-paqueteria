package paquetes;

/**
 * Representa un paquete de tipo grande con un tamaño y costo específicos.
 * Implementa la interfaz {@code PaqueteStrategy}.
 * Representa una ConcreteStrategy y un ConcreteProduct.
 *
 * @author Roberto García
 */
public class Grande implements PaqueteStrategy {

    /**
     * Devuelve el tamaño del paquete.
     *
     * @return el tamaño del paquete como {@code String}.
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
