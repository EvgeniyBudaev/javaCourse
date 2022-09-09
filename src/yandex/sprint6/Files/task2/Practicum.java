package yandex.sprint6.Files.task2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class Practicum {

    public static void main(String[] args) throws IOException {
        Map<String, Integer> frequencyMap = new HashMap<>();

        FileReader reader = new FileReader("C:\\evgeniybudaev\\CODE\\Java\\javaCourse\\src\\yandex\\sprint6\\Files\\task2\\result.txt");
        BufferedReader br = new BufferedReader(reader);

        // читайте файл построчно и сразу обновляйте frequencyMap.
        while (br.ready()) {
            String line = br.readLine();
            if (frequencyMap.containsKey(line)) {
                frequencyMap.put(line, frequencyMap.get(line) + 1);
            } else {
                frequencyMap.put(line, 1);
            }
        }

        br.close();

        // выведите результат в формате "<буква>: <количество>".
        for (Map.Entry<String, Integer> entry : frequencyMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}