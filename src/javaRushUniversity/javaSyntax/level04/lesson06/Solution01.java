package javaRushUniversity.javaSyntax.level04.lesson06; // task03.task0312;

import java.util.Scanner;

/*
Сравним строки
*/

/* Напиши программу, которая считывает с клавиатуры две строки и выдает сообщение о том, одинаковые ли эти строки. */

public class Solution01 {
    public static void main(String[] args) {
        //напишите тут ваш код
        Scanner scanner = new Scanner(System.in);
        String text1 = scanner.nextLine();
        String text2 = scanner.nextLine();
        if (text1.equals(text2)) {
            System.out.println("строки одинаковые");
        } else {
            System.out.println("строки разные");
        }
    }
}
