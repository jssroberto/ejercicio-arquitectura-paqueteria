package paquetes;

/**
 * Interfaz que define el comportamiento de un paquete.
 * Proporciona m�todos para obtener el tama�o y el costo del paquete.
 * Representa a Strategy y a Product.
 *
 * @author Roberto Garc�a
 */
public interface PaqueteStrategy {
    
    /**
     * Devuelve el tama�o del paquete.
     *
     * @return el tama�o del paquete como {@code String}.
     */
    public String getTamano();

    /**
     * Devuelve el costo del paquete.
     *
     * @return el costo del paquete como {@code double}.
     */
    public double getCosto();
}
