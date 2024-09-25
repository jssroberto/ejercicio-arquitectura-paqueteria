package pruebas;

import java.util.Scanner;
import pedidos.Pedido;

/**
 * Clase principal que permite al usuario interactuar con el sistema de pedidos.
 * Esta clase se encarga de capturar la información del usuario sobre el tipo de
 * servicio, el tamaño del paquete, la distancia al destino y la divisa para
 * calcular el costo del envío.
 */
public class Main {

    /**
     * Método principal que inicia la ejecución del programa.
     *
     * @param args Argumentos de línea de comandos.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean continuar = true;

        while (continuar) {
            String tipoServicio = "";
            String tamanoPaquete = "";
            double distancia;
            String divisa = "";

            int opcionServicio = 0;
            while (opcionServicio == 0) {
                System.out.println("""
                                   
            Ingrese el número correspondiente al tipo de servicio que desea: 
            1. Estándar
            2. Express""");
                opcionServicio = scanner.nextInt();
                switch (opcionServicio) {
                    case 1 ->
                        tipoServicio = "Estandar";
                    case 2 ->
                        tipoServicio = "Express";
                    default ->
                        System.out.println("Opción no válida. Intente de nuevo.");
                }
            }

            int opcionTamano = 0;
            while (opcionTamano == 0) {
                System.out.println("""
                               
            Ingrese el número correspondiente al tamaño del paquete que desea enviar:
            1. Sobre
            2. Pequeño
            3. Mediano
            4. Grande""");
                opcionTamano = scanner.nextInt();
                switch (opcionTamano) {
                    case 1 ->
                        tamanoPaquete = "Sobre";
                    case 2 ->
                        tamanoPaquete = "Pequeño";
                    case 3 ->
                        tamanoPaquete = "Mediano";
                    case 4 ->
                        tamanoPaquete = "Grande";
                    default ->
                        System.out.println("Opción no válida. Intente de nuevo.");
                }
            }

            System.out.print("\nIngrese la distancia al destino en km (solo número): ");
            distancia = scanner.nextDouble();

            int opcionDivisa = 0;
            while (opcionDivisa == 0) {
                System.out.println("""
                             
            ¿En qué divisa desea mostrar el total a pagar? (ingresa el número correspondiente): 
            1. Pesos mexicanos
            2. Dólares americanos""");
                opcionDivisa = scanner.nextInt();
                switch (opcionDivisa) {
                    case 1 ->
                        divisa = "Pesos";
                    case 2 ->
                        divisa = "Dolares";
                    default ->
                        System.out.println("Opción no válida. Intente de nuevo.");
                }
            }

            // Crear el pedido y mostrar el resultado
            Pedido pedido = new Pedido(tipoServicio, tamanoPaquete, distancia, divisa);
            pedido.getPedido();

            // Preguntar al usuario si desea iniciar de nuevo
            System.out.print("¿Desea iniciar de nuevo? (S/N): ");
            String respuesta = scanner.next();
            continuar = respuesta.equalsIgnoreCase("s");
        }
    }

}
