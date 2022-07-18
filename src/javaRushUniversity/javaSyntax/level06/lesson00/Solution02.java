package javaRushUniversity.javaSyntax.level06.lesson00; // task04.task0402;

import java.util.Scanner;

/*
Все любят Мамбу
*/

/* Ввести с клавиатуры имя и, используя цикл while, 10 раз вывести: <имя> любит меня (переменная text).
Каждый вывод - с новой строки. */

public class Solution02 {
    public static void main(String[] args) {
        String text = " любит меня.";
        //напишите тут ваш код
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        int count = 10;
        while (count > 0) {
            System.out.println(name + text);
            count--;
        }
    }
}
