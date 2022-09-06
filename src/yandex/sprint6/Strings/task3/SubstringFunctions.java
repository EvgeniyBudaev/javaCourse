package yandex.sprint6.Strings.task3;

public class SubstringFunctions {
    public boolean startsWith(String initial, String other) {
        // реализуйте метод
        if (initial.indexOf(other) >= 0) {
            return true;
        } else {
            return false;
        }
    }
}