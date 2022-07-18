package javaRushUniversity.javaSyntax.level07.lesson02; // task05.task0507;

import java.util.Scanner;

/*
Максимальное из N чисел
*/

/* Максимальное из N чисел

В этой задаче тебе нужно:

    Ввести с клавиатуры число N.
    Считать N целых чисел и заполнить ими массив array.
    Найти максимальное число среди элементов массива. */

public class Solution03 {
    public static int[] array;

    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        array = new int[N];

        for (int i = 0; i < array.length; i++){
            array[i] = scanner.nextInt();
        }

        int max = array[0];
        for (int i = 1; i < N; i++) {
            if (array[i] > max)

                max = array[i];
        }
        System.out.println(max);
    }
}
