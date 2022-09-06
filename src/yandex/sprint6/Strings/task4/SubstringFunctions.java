package yandex.sprint6.Strings.task4;

public class SubstringFunctions {
    public static void main(String[] args) {
        endsWith("котик", "ик");
    }
    public static boolean endsWith(String initial, String other) {
        if (initial.indexOf(other) + other.length() == initial.length()) {
            return true;
        } else {
            return false;
        }
    }
}