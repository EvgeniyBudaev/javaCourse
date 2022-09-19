package yandex.sprint7.FunctionStyle.task1;

import java.time.temporal.ChronoUnit;
import java.time.LocalDateTime;
import java.util.LinkedList;
import java.util.List;

class StringsSaver {
    // количество запоминаемых строк
    public static final int MAX_SIZE = 3;

    private List<String> saved = new LinkedList<>();

    private boolean doAddDate; // добавлять ли дату?

    public void setDoAddDate(boolean doAddDate) {
        this.doAddDate = doAddDate;
    }

    // сохранить строку
    public void save(String line) {
        if (saved.size() == MAX_SIZE) {
            saved.remove(0);
        }

        if (doAddDate) {
            line = "[" + LocalDateTime.now().truncatedTo(ChronoUnit.MINUTES) + "] " + line;
        }
        saved.add(line);
        doPrintErrors(line);
    }

    // получить последние MAX_SIZE сохранённых строк
    public List<String> getSaved() {
        return saved;
    }

    public void setDoPrintErrors(boolean doPrintErrors) {
        this.doAddDate = doPrintErrors;
    }

    public boolean doPrintErrors(String line) {
        if (line == "ERROR") {
            System.out.println(line);
            if (doAddDate) {
                System.out.println("[" + LocalDateTime.now().truncatedTo(ChronoUnit.MINUTES) + "] " + line);
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }
}

public class Practicum {
    public static void main(String[] args) {
        StringsSaver saver = new StringsSaver();
        saver.setDoAddDate(true); // включаем режим
        saver.save("Пользователь залогинился.");
        saver.save("Пользователь загрузил фото.");
        saver.save("Пользователь пополнил счёт.");
        saver.save("Пользователь продлил подписку.");
        saver.save("Пользователь опубликовал пост.");
        System.out.println(saver.getSaved());
    }
}