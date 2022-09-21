package yandex.sprint7.Optional.task2;

import java.util.List;
import java.util.Optional;

public class Practicum {

    public static Optional<String> longestName(List<Optional<String>> maybeNames) {
        if (maybeNames.isEmpty()) {
            return Optional.empty();
        }
        Optional<String> max = maybeNames.get(0);
        for (Optional<String> name: maybeNames) {
            if (name.isPresent() && max.isPresent()) {
                if (name.get().length() > max.get().length()) {
                    max = name;
                }
            }
        }
        return max;
    }

    public static void main(String[] args) {
        Optional<String> longestOptional = longestName(List.of(
                Optional.of("Max"),
                Optional.empty(),
                Optional.of("Alexey"),
                Optional.empty(),
                Optional.empty(),
                Optional.of("Alex")
        ));
        if (longestOptional.isPresent()) {
            String longestName = longestOptional.get();
            System.out.println("Самое длинное имя состоит из "
                    + longestName.length() + " символов.");
        } else {
            System.out.println("Такого имени нет.");
        }
    }
}

