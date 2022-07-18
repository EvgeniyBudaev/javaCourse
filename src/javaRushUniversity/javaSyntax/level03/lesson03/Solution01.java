package javaRushUniversity.javaSyntax.level03.lesson03; // task02.task0215;

import java.util.Scanner;

/*
Чтение чисел
*/

/* Считай с клавиатуры три целых числа.
Выведи на экран их среднее арифметическое. */

public class Solution01 {
    public static void main(String[] args) {
        //напишите тут ваш код
        Scanner scanner = new Scanner(System.in);
        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();
        int number3 = scanner.nextInt();
        System.out.println((number1 + number2 + number3) / 3);
    }
}
