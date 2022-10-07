package yandex.sprint8.NetworkRequests.task9;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class Converter {
    private final HttpClient client;

    public Converter() {
        this.client = HttpClient.newHttpClient();
    }

    private double getRate(String rate) {
        double result = 0.0;
        String str = "https://api.exchangerate.host/latest?base=RUB&symbols=" + rate;
        URI url = URI.create(str);
        HttpRequest request = HttpRequest.newBuilder()
                .uri(url)
                .GET()
                .build();
        try {
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
            if (response.statusCode() == 200) {
                JsonElement jsonElement = JsonParser.parseString(response.body());
                if(!jsonElement.isJsonObject()) {
                    System.out.println("Ответ от сервера не соответствует ожидаемому.");
                }
                JsonObject jsonObject = jsonElement.getAsJsonObject();
                JsonObject rates = jsonObject.get("rates").getAsJsonObject();
                result = rates.get(rate).getAsDouble();
            } else {
                System.out.println("Что-то пошло не так. Сервер вернул код состояния: " + response.statusCode());
            }
        } catch (IOException | InterruptedException e) {
            System.out.println("Во время выполнения запроса возникла ошибка.\n" +
                    "Проверьте, пожалуйста, адрес и повторите попытку.");
        }
        return result;
    }

    public void convert(double rubles, int currency) {
        if (currency == 1) {
            double rateUSD = getRate("USD");
            System.out.println("Ваши сбережения в долларах: " + rubles * rateUSD);
        } else if (currency == 2) {
            double rateEUR = getRate("EUR");
            System.out.println("Ваши сбережения в евро: " + rubles * rateEUR);
        } else if (currency == 3) {
            double rateJPY = getRate("JPY");
            System.out.println("Ваши сбережения в иенах: " + rubles * rateJPY);
        } else {
            System.out.println("Неизвестная валюта");
        }
    }
}