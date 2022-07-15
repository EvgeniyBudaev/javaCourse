package javaRushUniversity.javaSyntax.level07.lesson02;

import java.util.Scanner;

/*
Reverse
*/

/* Тебе нужно написать программу, которая:

    Считывает с консоли целое число N.
    Если считанное число N больше 0, то программа дальше считывает целые числа, количество которых равно N.
    Вывести в консоль считанные числа, если N нечетное — в порядке ввода, иначе — в обратном порядке.

Каждое число выводить с новой строки. Число N выводить не нужно. */

public class Solution01 {
    public static void main(String[] args) {
        //напишите тут ваш код
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int[] array = new int[N];

        for (int i = 0; i < array.length; i++){
            array[i] = scanner.nextInt();
        }

        if (N % 2 != 0) {
            for (int k = 0; k < array.length; k++) {
                System.out.println(array[k]);
            }
        } else {
            for (int j = array.length - 1; j >= 0; j--) {
                System.out.println(array[j]);
            }
        }
    }
}
