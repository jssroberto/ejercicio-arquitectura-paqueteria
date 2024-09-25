package adaptadores;

import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.google.gson.JsonSyntaxException;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

/**
 * Clase que representa un sistema de conversión de dólares a pesos mexicanos.
 * Esta clase obtiene la tasa de cambio actual desde una API y permite convertir
 * una cantidad de pesos mexicanos a dólares. Representa a Adaptee
 *
 * @author Roberto García
 */
public class SistemaConversionDolares {

    private static final String API_URL = "https://api.exchangerate-api.com/v4/latest/USD";
    private final double tasaDeCambio;

    /**
     * Constructor de la clase que inicializa la tasa de cambio.
     */
    public SistemaConversionDolares() {
        tasaDeCambio = obtenerTasaDeCambio();
    }

    /**
     * Obtiene la tasa de cambio actual desde la API.
     *
     * @return la tasa de cambio como {@code double}.
     */
    private double obtenerTasaDeCambio() {
        try {
            URL url = new URL(API_URL);
            HttpURLConnection con = (HttpURLConnection) url.openConnection();
            con.setRequestMethod("GET");

            StringBuilder response;
            try (
                    BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()))) {
                String inputLine;
                response = new StringBuilder();
                while ((inputLine = in.readLine()) != null) {
                    response.append(inputLine);
                }
            }
            return 1.0 / analizarRespuesta(response.toString());
        } catch (IOException e) {
            System.out.println("No se pudo obtener la divisa en tiempo real, usando tasa de 1USD = 20MXN");
            return 0.05;
        }
    }

    /**
     * Analiza la respuesta JSON de la API para obtener la tasa de cambio.
     *
     * @param jsonResponse la respuesta JSON de la API.
     * @return la tasa de cambio como {@code double}.
     */
    private double analizarRespuesta(String jsonResponse) {
        double tasaCambio;
        try {
            JsonObject jsonObject = JsonParser.parseString(jsonResponse).getAsJsonObject();
            JsonObject rates = jsonObject.getAsJsonObject("rates");
            tasaCambio = rates.get("MXN").getAsDouble();
        } catch (JsonSyntaxException e) {
            System.out.println("No se pudo obtener la divisa en tiempo real, usando tasa de 1USD = 20MXN");
            tasaCambio = 0.05;
        }
        return tasaCambio;
    }

    /**
     * Convierte una cantidad en dólares a pesos mexicanos utilizando la tasa de
     * cambio.
     *
     * @param cantidad la cantidad en dólares.
     * @return la cantidad convertida a pesos mexicanos como {@code double}.
     */
    public double convertir(double cantidad) {
        return cantidad * tasaDeCambio;
    }
}
