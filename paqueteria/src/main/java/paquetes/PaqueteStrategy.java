package paquetes;

/**
 * Interfaz que define el comportamiento de un paquete.
 * Proporciona métodos para obtener el tamaño y el costo del paquete.
 * Representa a Strategy y a Product.
 *
 * @author Roberto García
 */
public interface PaqueteStrategy {
    
    /**
     * Devuelve el tamaño del paquete.
     *
     * @return el tamaño del paquete como {@code String}.
     */
    public String getTamano();

    /**
     * Devuelve el costo del paquete.
     *
     * @return el costo del paquete como {@code double}.
     */
    public double getCosto();
}
