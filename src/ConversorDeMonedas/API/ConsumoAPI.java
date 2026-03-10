package ConversorDeMonedas.API;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConsumoAPI {

    private static final String URL = "https://v6.exchangerate-api.com/v6/";
    private static final String API = "TU_APIKEY";

    public static double obtenerTasa(String primeraMoneda, String segundaMoneda) {
        try {
            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create(URL + API + "/pair/" + primeraMoneda+"/"+segundaMoneda))
                    .build();

            HttpResponse<String> response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());
            JsonElement elemento = JsonParser.parseString(response.body());
            JsonObject objectRoot = elemento.getAsJsonObject();
            return objectRoot.get("conversion_rate").getAsDouble();

        }catch (IOException | InterruptedException e){
            throw new RuntimeException(e);
        }
    }
}
