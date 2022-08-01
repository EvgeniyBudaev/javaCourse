package javaRushUniversity.javaSyntax.level20.lesson03; // task13.task1321;

/* В классе Solution есть метод getTranslationForDayOfWeek(String), который возвращает перевод дня недели с английского
на русский. Твоя задача — переписать метод, используя только оператор if-else. */

public class Solution02 {

    public static void main(String[] args) {
        System.out.println(getTranslationForDayOfWeek("Вторник"));
        System.out.println(getTranslationForDayOfWeek("Пятница"));
        System.out.println(getTranslationForDayOfWeek("Высплюсенье"));
    }

    public static String getTranslationForDayOfWeek(String ru) {
        String en;
        if (ru.toLowerCase().equals("понедельник")) {
            en = "Monday";
        } else if (ru.toLowerCase().equals("вторник")) {
            en = "Tuesday";
        } else if (ru.toLowerCase().equals("среда")) {
            en = "Wednesday";
        } else if (ru.toLowerCase().equals("четверг")) {
            en = "Thursday";
        } else if (ru.toLowerCase().equals("пятница")) {
            en = "Friday";
        } else if (ru.toLowerCase().equals("суббота")) {
            en = "Saturday";
        } else if (ru.toLowerCase().equals("воскресенье")) {
            en = "Sunday";
        } else {
            en = "Недействительный день недели";
        }
        return en;
    }
}