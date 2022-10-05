package yandex.sprint8.CreateAPI.task9;

import com.sun.net.httpserver.Headers;
import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;
import com.sun.net.httpserver.HttpServer;

import java.io.*;
import java.net.InetSocketAddress;
import java.util.List;

public class Practicum {
    private static final int PORT = 8080;

    public static void main(String[] args) throws IOException {
        HttpServer httpServer = HttpServer.create();

        httpServer.bind(new InetSocketAddress(PORT), 0);
        httpServer.createContext("/hello", new HelloHandler());
        httpServer.start();
        System.out.println("HTTP-сервер запущен на " + PORT + " порту!");
        httpServer.stop(1);
    }

    static class HelloHandler implements HttpHandler {
        @Override
        public void handle(HttpExchange httpExchange) throws IOException {
            String response = "";

            // извлеките метод из запроса
            String method = httpExchange.getRequestMethod();

            switch(method) {
                case "GET":
                    response = "Здравствуйте!";
                    break;
                // сформируйте ответ в случае, если был вызван POST-метод
                case "POST":
                    // извлеките тело запроса
                    System.out.println("POST");
                    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(httpExchange.getRequestBody()));
                    String body = bufferedReader.readLine();
                    System.out.println("body: " + body);

                    // извлеките path из запроса
                    String path = httpExchange.getRequestURI().getPath();
                    // а из path — профессию и имя
                    String[] splitStrings = path.split("/");
                    String profession = splitStrings[2];
                    String name = splitStrings[3];

                    // извлеките заголовок
                    Headers requestHeaders = httpExchange.getRequestHeaders();
                    List<String> wishGoodDay = requestHeaders.get("X-Wish-Good-Day");
                    if ((wishGoodDay != null) && (wishGoodDay.contains("true")) && body.equals("Доброе утро")) {
                        response = body + ", " + profession + " " + name + "! Хорошего дня!";
                    } else {
                        response = body + ", " + profession + " " + name + "!";
                    }
                    break;

                    // соберите ответ
                    // не забудьте про ответ для остальных методов;
                default:
                    response = "Некорректный метод!";
            }

            httpExchange.sendResponseHeaders(200, 0);
            try (OutputStream os = httpExchange.getResponseBody()) {
                os.write(response.getBytes());
            }
        }
    }
}