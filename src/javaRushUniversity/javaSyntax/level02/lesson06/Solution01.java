package javaRushUniversity.javaSyntax.level02.lesson06;

/*
Полнометражная картина
*/

/* В переменной centimeters записано количество сантиметров.
В переменную meters нужно записать количество полных метров в centimeters (1 метр = 100 см).
Для вычисления используй переменную centimeters и оператор деления.
Для объявления и инициализации meters используй одну команду. */

public class Solution01 {
    public static void main(String[] args) {
        int centimeters = 243;

        int meters = centimeters / 100; //напишите тут ваш код

        System.out.println(meters);
    }
}
