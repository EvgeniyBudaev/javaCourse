package javaRushUniversity.javaSyntax.level04.lesson03; // task03.task0307;

import java.util.Scanner;

/*
Работать или не работать - вот в чем вопрос
*/

/* Напишем программу, которая будет считывать с клавиатуры возраст. Если возраст от 20 до 60 (включительно), то выводить
 ничего не нужно, иначе - вывести фразу "можно не работать". Сделать это можно (и нужно!) с помощью только одного
 оператора if без else.

Подсказка: используй логический оператор "||" (или).
 */

public class Solution01 {
    public static void main(String[] args) {
        //напишите тут ваш код
        Scanner scanner = new Scanner(System.in);
        int age = scanner.nextInt();
        if (age < 20 || age > 60) {
            System.out.println("можно не работать");
        }
    }
}
