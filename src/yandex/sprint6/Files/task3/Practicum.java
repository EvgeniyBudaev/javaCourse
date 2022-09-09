package yandex.sprint6.Files.task3;

import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.nio.charset.StandardCharsets;

public class Practicum {

    public static void main(String[] args) {

        try (Writer out = new OutputStreamWriter(System.out, StandardCharsets.UTF_8)) {
            out.write(decodeText(
                    "Съешь ещё этих мягких французских булок да выпей же чаю"));

        } catch (IOException e) {
            // игнорируем
        }
    }

    static String decodeText(String input) throws IOException {
        return new BufferedReader(new InputStreamReader(
                new ByteArrayInputStream(input.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8)).readLine();
    }
}
