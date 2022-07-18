package javaRushUniversity.javaSyntax.level04.lesson04; // task03.task0311;

import java.util.Scanner;

/*
Высокая точность
*/

/* Напиши программу, которая считывает с клавиатуры два вещественных числа (double) и выдает сообщение о том, равны ли
 эти числа с точностью до одной миллионной. */

public class Solution03 {
    public static void main(String[] args) {
        //напишите тут ваш код
        Scanner scanner = new Scanner(System.in);
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        if (Math.abs(a - b) < 0.000001) {
            System.out.println("числа равны");
        } else {
            System.out.println("числа не равны");
        }
    }
}
