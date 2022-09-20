package yandex.sprint7.FunctionStyle.task3;

import java.time.LocalDateTime;
import java.util.*;

interface StringsSaverConfig {
    // как нужно преобразовать сохраняемую строку?
    String transform(String line);

    // дополнительное действие при сохранении
    void onSave(String line);
}

class StringsSaver {
    public static final int MAX_SIZE = 10_000;

    private List<String> saved = new LinkedList<>();
    private StringsSaverConfig config;

    public StringsSaver(StringsSaverConfig config) {
        this.config = config;
    }

    public void save(String line) {
        if (saved.size() == MAX_SIZE) {
            saved.remove(0);
        }
        line = config.transform(line);
        saved.add(line);
        config.onSave(line);
    }

    public List<String> getSaved() {
        return saved;
    }
}

public class Practicum {

    public static void main(String[] args) {
        StringsSaverConfig config = new StringsSaverConfig() {
            List<String> errors = new ArrayList<>();

            @Override
            public String transform(String line) {
                return "[" + LocalDateTime.now() + "] " + line;
            }

            @Override
            public void onSave(String line) {
                if (line.contains("ERROR")) {
                    errors.add(line);
                    if (errors.size() == 2) {
                        System.out.println("[1] " + errors.get(0));
                        System.out.println("[2] " + errors.get(1));
                    } else if (errors.size() > 2) {
                        System.out.println("[" + errors.size() + "] " + errors.get(errors.size() - 1));
                    }
                } else {
                    errors.clear();
                }
            }
        };

        StringsSaver saver = new StringsSaver(config);
        saver.save("Пользователь залогинился");
        saver.save("ERROR Пользователь загрузил фото");     // ничего не выводим
        saver.save("ERROR Пользователь загрузил видео");    // вывод "2 ошибки подряд"
        saver.save("ERROR Пользователь загрузил аватар");   // вывод "3 ошибки подряд"
        saver.save("Пользователь пополнил счёт");
        saver.save("Пользователь купил артефакт");
        saver.save("ERROR Пользователь опубликовал пост");  // ничего не выводим
        saver.save("Пользователь продал артефакт");
        saver.save("ERROR Пользователь опубликовал пост");
        saver.save("ERROR Пользователь опубликовал пост");  // вывод "2 ошибки подряд"
        System.out.println(saver.getSaved());

    }
}