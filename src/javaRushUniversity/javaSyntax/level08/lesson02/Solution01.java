package javaRushUniversity.javaSyntax.level08.lesson02;

/*
Знакомство с двумерным массивом
*/

/* В классе Solution проинициализируй поле array значением двумерного массива целых чисел размерностью 2х3.
В методе main заполни этот массив целыми числами (кроме 0) и выведи на экран. */

import java.util.Arrays;

public class Solution01 {
    public static int[][] array;//напишите тут ваш код

    public static void main(String[] args) {
        //напишите тут ваш код
        array = new int[2][3]; // { {n, n}, {n, n}, {n, n} }

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = (i +1) + (j + 1);
                System.out.println(array[i][j]);
            }
        }
    }
}
