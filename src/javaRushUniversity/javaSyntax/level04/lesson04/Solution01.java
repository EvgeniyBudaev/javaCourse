package javaRushUniversity.javaSyntax.level04.lesson04; // task03.task0309;

import java.util.Scanner;

/*
Ищем максимум
*/

/* Ищем максимум

У нас есть программа, которая считывает с клавиатуры два числа и выводит на экран большее из них. Если числа одинаковые,
то выводится любое.
Перепиши программу с использованием тернарного оператора, чтобы ее функционал остался без изменений.  */

public class Solution01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberA = scanner.nextInt();
        int numberB = scanner.nextInt();
        System.out.println(numberA > numberB ? numberA : numberB);
    }
}
