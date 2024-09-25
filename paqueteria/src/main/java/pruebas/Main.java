package pruebas;

import java.util.Scanner;
import pedidos.Pedido;

/**
 * Clase principal que permite al usuario interactuar con el sistema de pedidos.
 * Esta clase se encarga de capturar la informaci�n del usuario sobre el tipo de
 * servicio, el tama�o del paquete, la distancia al destino y la divisa para
 * calcular el costo del env�o.
 */
public class Main {

    /**
     * M�todo principal que inicia la ejecuci�n del programa.
     *
     * @param args Argumentos de l�nea de comandos.
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
                                   
            Ingrese el n�mero correspondiente al tipo de servicio que desea: 
            1. Est�ndar
            2. Express""");
                opcionServicio = scanner.nextInt();
                switch (opcionServicio) {
                    case 1 ->
                        tipoServicio = "Estandar";
                    case 2 ->
                        tipoServicio = "Express";
                    default ->
                        System.out.println("Opci�n no v�lida. Intente de nuevo.");
                }
            }

            int opcionTamano = 0;
            while (opcionTamano == 0) {
                System.out.println("""
                               
            Ingrese el n�mero correspondiente al tama�o del paquete que desea enviar:
            1. Sobre
            2. Peque�o
            3. Mediano
            4. Grande""");
                opcionTamano = scanner.nextInt();
                switch (opcionTamano) {
                    case 1 ->
                        tamanoPaquete = "Sobre";
                    case 2 ->
                        tamanoPaquete = "Peque�o";
                    case 3 ->
                        tamanoPaquete = "Mediano";
                    case 4 ->
                        tamanoPaquete = "Grande";
                    default ->
                        System.out.println("Opci�n no v�lida. Intente de nuevo.");
                }
            }

            System.out.print("\nIngrese la distancia al destino en km (solo n�mero): ");
            distancia = scanner.nextDouble();

            int opcionDivisa = 0;
            while (opcionDivisa == 0) {
                System.out.println("""
                             
            �En qu� divisa desea mostrar el total a pagar? (ingresa el n�mero correspondiente): 
            1. Pesos mexicanos
            2. D�lares americanos""");
                opcionDivisa = scanner.nextInt();
                switch (opcionDivisa) {
                    case 1 ->
                        divisa = "Pesos";
                    case 2 ->
                        divisa = "Dolares";
                    default ->
                        System.out.println("Opci�n no v�lida. Intente de nuevo.");
                }
            }

            // Crear el pedido y mostrar el resultado
            Pedido pedido = new Pedido(tipoServicio, tamanoPaquete, distancia, divisa);
            pedido.getPedido();

            // Preguntar al usuario si desea iniciar de nuevo
            System.out.print("�Desea iniciar de nuevo? (S/N): ");
            String respuesta = scanner.next();
            continuar = respuesta.equalsIgnoreCase("s");
        }
    }

}
