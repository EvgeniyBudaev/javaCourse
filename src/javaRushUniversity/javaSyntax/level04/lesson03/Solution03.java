package javaRushUniversity.javaSyntax.level04.lesson03; // task03.task0306;

import java.util.Scanner;

/*
Треугольник
*/

/* Напишем программу, которая будет просчитывать возможность существования треугольника на основе длин его сторон.
Для этого тебе нужно:

    Ввести с клавиатуры три числа – длины сторон предполагаемого треугольника.
    Определить возможность существования треугольника по сторонам.

Результат вывести на экран в следующем виде: "треугольник существует" или "треугольник не существует". */

public class Solution03 {
    private static final String TRIANGLE_EXISTS = "треугольник существует";
    private static final String TRIANGLE_NOT_EXISTS = "треугольник не существует";

    public static void main(String[] args) {
        //напишите тут ваш код
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        if ((a < b +c) && (b < a +c) && (c < a+b))
            System.out.println(TRIANGLE_EXISTS);
        else
            System.out.println(TRIANGLE_NOT_EXISTS);
    }
}
