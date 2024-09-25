package paquetes;

/**
 * Representa un paquete de tipo pequeño con un tamaño y costo específicos.
 * Implementa la interfaz {@code PaqueteStrategy}.
 * Representa una ConcreteStrategy y un ConcreteProduct.
 *
 * @author Roberto García
 */
public class Pequeno implements PaqueteStrategy {

    /**
     * Devuelve el tamaño del paquete.
     *
     * @return el tamaño del paquete como {@code String}.
     */
    @Override
    public String getTamano() {
        return "Pequeno";
    }

    /**
     * Devuelve el costo del paquete.
     *
     * @return el costo del paquete como {@code double}.
     */
    @Override
    public double getCosto() {
        return 10.0;
    }

}
