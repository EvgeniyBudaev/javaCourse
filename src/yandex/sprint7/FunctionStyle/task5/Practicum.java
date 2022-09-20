package yandex.sprint7.FunctionStyle.task5;

import java.util.*;
import java.util.function.Consumer;
import java.util.function.Predicate;

class FilteredSaver {
    private List<String> saved = new ArrayList<>();
    private List<Predicate<String>> filters = new ArrayList<>();
    private Consumer<String> onSaveListener;

    public void setOnSaveListener(Consumer<String> onSaveListener) {
        this.onSaveListener = onSaveListener;
    }

    public void addFilter(Predicate<String> filter) {
        filters.add(filter);
    }

    public void save(String line) {
        for (Predicate<String> filter : filters) {
            if (!filter.test(line)) {
                return;
            }
        }
        if (onSaveListener != null) {
            onSaveListener.accept(line);
        }
        saved.add(line);
    }

    public List<String> getSaved() {
        return saved;
    }
}

public class Practicum {


    public static void main(String[] args) {
        FilteredSaver saver = new FilteredSaver();
        saver.setOnSaveListener(new Consumer<String>() {
            @Override
            public void accept(String line) {
                System.out.println("СОХРАНЕНО: " + line);
            }
        });
        saver.addFilter(new Predicate<String>() {
            @Override
            public boolean test(String line) {
                return line.contains("ВАЖНО");
            }
        });
        saver.addFilter(new Predicate<String>() {
            @Override
            public boolean test(String line) {
                return line.endsWith("!");
            }
        });

        saver.save("Привет!");  // не сохранится
        saver.save("ВАЖНО - это важное слово"); // не сохранится
        saver.save("ВАЖНО! Не забывай его использовать для заметок!"); // сохранится и выведется на экран
        saver.save("Но и память тренировать тоже очень ВАЖНО!");    // сохранится и выведется на экран
        System.out.println(saver.getSaved());   // список из двух сохранённых сообщений
    }
}