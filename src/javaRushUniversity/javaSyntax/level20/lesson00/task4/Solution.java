package javaRushUniversity.javaSyntax.level20.lesson00.task4; // task13.task1318;

/*
Следующий месяц, пожалуйста
*/

/* В классе Solution реализуй метод getNextMonth, который должен возвращать следующий месяц, а если передан последний
месяц, возвращать первый. Используй методы values и ordinal. Метод main не участвует в проверке. */

public class Solution {

    public static void main(String[] args) {
        System.out.println(getNextMonth(Month.JANUARY));
        System.out.println(getNextMonth(Month.JULY));
    }

    public static Month getNextMonth(Month month) {
        //напишите тут ваш код
        Month[] months = month.values();
        int index = month.ordinal();
        if (months.length - 1 == index) {
            return months[0];
        }
        return months[index + 1];
    }
}