package yandex.sprint8.NetworkRequests.task8;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

public class Practicum {
    public static void main(String[] args) {
        HttpClient client = HttpClient.newHttpClient();

        URI url = URI.create("https://api.exchangerate.host/latest?base=RUB&symbols=USD,EUR");
        HttpRequest request = HttpRequest.newBuilder()
                .uri(url)
                .GET()
                .build();

        try {
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
            // проверяем, успешно ли обработан запрос
            if (response.statusCode() == 200) {
                JsonElement jsonElement = JsonParser.parseString(response.body());
                if(!jsonElement.isJsonObject()) { // проверяем, точно ли мы получили JSON-объект
                    System.out.println("Ответ от сервера не соответствует ожидаемому.");
                    return;
                }
                // получите курс доллара и евро и запишите в переменные rateUSD и rateEUR
                JsonObject jsonObject = jsonElement.getAsJsonObject();
                System.out.println("jsonObject: " + jsonObject);
                JsonObject rates = jsonObject.get("rates").getAsJsonObject();
                String rateUSD = rates.get("USD").getAsString();
                String rateEUR = rates.get("EUR").getAsString();

                System.out.println("Стоимость рубля в долларах: " + rateUSD + " USD");
                System.out.println("Стоимость рубля в евро: " + rateEUR + " EUR");
            } else {
                System.out.println("Что-то пошло не так. Сервер вернул код состояния: " + response.statusCode());
            }
        } catch (IOException | InterruptedException e) { // обрабатываем ошибки отправки запроса
            System.out.println("Во время выполнения запроса возникла ошибка.\n" +
                    "Проверьте, пожалуйста, адрес и повторите попытку.");
        }
    }
}