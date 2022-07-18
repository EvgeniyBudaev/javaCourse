package javaRushUniversity.javaSyntax.level08.lesson02; // task06.task0627;

import java.util.Scanner;

/*
Вот это переворот!
*/

/* В классе Solution дан двумерный массив целых чисел (поле array) размерностью 3х3. Необходимо:

    построчно заполнить этот массив числами с клавиатуры;
    перевернуть массив относительно главной диагонали (у главной диагонали есть свойство i == j);
    вывести перевернутый массив на экран в таком виде, как в примере — каждую строку отдельно, элементы в строке
     через пробел. */

public class Solution05 {
    public static int[][] array = new int[3][3];

    public static void main(String[] args) {
        //напишите тут ваш код
        Scanner scanner = new Scanner(System.in);
        int[][] arrayNew = new int[3][3];

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                int number = scanner.nextInt();
                array[i][j] = number;
            }
        }

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (i == j) {
                    arrayNew[i][j] = array[j][i];
                } else {
                    arrayNew[i][j] = array[j][i];
                }
            }
        }

        array = arrayNew;

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }

    }
}
