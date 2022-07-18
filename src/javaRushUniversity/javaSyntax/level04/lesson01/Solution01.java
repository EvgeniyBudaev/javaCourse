package javaRushUniversity.javaSyntax.level04.lesson01; // task03.task0303;

import java.util.Scanner;

/*
Школа или институт
*/

/* Есть программа, которая принимает на вход возраст и определяет, нужно в школу или уже пора в институт. Но она
 работает неправильно. Например, пятилетнего ребенка отправляют в институт! Исправить программу несложно: достаточно в
 нужном месте поставить фигурные скобки. */

public class Solution01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int age = scanner.nextInt();
        if (age < 18) {
            if (age >= 6) {
                System.out.println("нужно ходить в школу");
            }
        } else {
            System.out.println("пора в институт");
        }
    }
}
