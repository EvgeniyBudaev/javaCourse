package yandex.sprint6.Strings.task1;

public class CleanInput {
    public String fixString(String str) {
        if (str.trim().isBlank() || str.trim().isEmpty()) {
            return "Вы ничего не ввели!";
        } else {
            return str;
        }
    }
}
