package yandex.sprint7.FunctionStyle.task2;

import java.util.*;

public class Practicum {
    public static void main(String[] args) throws Exception {
        List<String> people = new ArrayList<>(List.of(
                "Мария Зуева",
                "Анна Дарк",
                "Кирилл Филимонов",
                "Ева Пинк"
        ));

        Comparator<String> comparator = new Comparator<String>() { // <-- напишите свой код здесь
            @Override
            public int compare(String text1, String text2) {
                return text1.split(" ")[1].length() - text2.split(" ")[1].length();
            }
        };

        Collections.sort(people, comparator);
        System.out.println(people);
    }
}