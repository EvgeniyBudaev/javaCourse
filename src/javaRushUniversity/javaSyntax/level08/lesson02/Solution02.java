package javaRushUniversity.javaSyntax.level08.lesson02; // task06.task0625;

import java.util.Scanner;

/*
Максимальный элемент
*/

/* В классе Solution дан двумерный массив целых чисел (поле array) размерностью 3х3. В методе main нужно заполнить
 построчно этот массив данными с клавиатуры и вывести на экран максимальный элемент массива.
 */

public class Solution02 {
    public static int[][] array = new int[3][3];

    public static void main(String[] args) {
        //напишите тут ваш код
        Scanner scanner = new Scanner(System.in);
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                int number = scanner.nextInt();
                array[i][j] = number;
                if (number > max) {
                    max = number;
                }
            }
        }

        System.out.println(max);
    }
}
