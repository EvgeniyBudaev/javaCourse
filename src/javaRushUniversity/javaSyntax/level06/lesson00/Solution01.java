package javaRushUniversity.javaSyntax.level06.lesson00;

/*
Я никогда не буду работать за копейки
*/

/* Используя цикл while вывести на экран сто раз цитату (переменная quote):
«Я никогда не буду работать за копейки. Амиго»

Каждое значение вывести с новой строки */

public class Solution01 {
    public static void main(String[] args) {
        String quote = "Я никогда не буду работать за копейки. Амиго";
        //напишите тут ваш код
        int count = 100;
        while (count > 0) {
            System.out.println(quote);
            count--;
        }
    }
}
