package yandex.sprint5.Set.task2;

import java.util.ArrayList;
import java.util.List;
import java.util.HashSet;
import java.util.Set;

public class Practicum {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        fillNames(names);
        System.out.println("Общее количество имён: " + names.size());

        Set<String> uniqueNames = new HashSet<>(names);
        System.out.println("Количество уникальных имён: " + uniqueNames.size());
    }

    private static void fillNames(List<String> names) {
        names.add("Максим");
        names.add("Светлана");
        names.add("Иван");
        names.add("Ольга");
        names.add("Максим");
        names.add("Пётр");
        names.add("Олег");
        names.add("Иван");
        names.add("Ольга");
        names.add("Ирина");
    }
}