package javaRushUniversity.javaSyntax.level07.lesson02; // task05.task0506;

import java.util.Scanner;

/*
Минимальное из N чисел
*/

/* Чтобы выполнить эту задачу, тебе нужно:

    Ввести с клавиатуры число N.
    Считать N целых чисел и заполнить ими массив.
    Найти минимальное число среди элементов массива и вывести в консоль. */

public class Solution02 {
    public static int[] array;

    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        array = new int[N];

        for (int i = 0; i < array.length; i++){
            array[i] = scanner.nextInt();
        }

        int min = array[0];
        for (int i = 1; i < N; i++) {
            if (array[i] < min)

                min = array[i];
        }
        System.out.println(min);
    }
}
