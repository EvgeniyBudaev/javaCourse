package javaRushUniversity.javaSyntax.level04.lesson04;

import java.util.Scanner;

/*
Через тернии...
*/

/* Эта программа написана с использованием тернарного оператора, но не совсем понятно, что она делает. Думаем, если
избавиться от тернарного оператора, то станет намного понятнее.
Перепиши программу без использования тернарного оператора. */

public class Solution02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        String result;
        if (number < 5) {
            result = "число меньше 5";
        } else {
            if (number > 5) {
                result = "число больше 5";
            } else {
                result = "число равно 5";
            }
        }
        System.out.println(result);
    }
}
