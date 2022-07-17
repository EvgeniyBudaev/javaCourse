package javaRushUniversity.javaSyntax.level08.lesson02;

import java.util.Scanner;

/*
Минимальная сумма
*/

/* В классе Solution дан двумерный массив целых чисел (поле array) размерностью 3х3. В методе main нужно заполнить
 построчно этот массив данными с клавиатуры, посчитать сумму элементов в каждом столбце и в каждой строке и вывести
 наименьшую из этих сумм на экран. */

public class Solution03 {
    public static int[][] array = new int[3][3];

    public static void main(String[] args) {
        //напишите тут ваш код
        Scanner scanner = new Scanner(System.in);

        int minSumLine = Integer.MAX_VALUE;
        int minSumColumn = Integer.MAX_VALUE;
        int sumLine = 0;
        int sumColumn = 0;

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = scanner.nextInt();
            }
        }

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                sumLine += array[i][j];
            }
            if (sumLine < minSumLine) {
                minSumLine = sumLine;
            }
            sumLine = 0;
        }

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                sumColumn += array[j][i];
            }
            if (sumColumn < minSumColumn) {
                minSumColumn = sumColumn;
            }
            sumColumn = 0;
        }

        if (minSumColumn < minSumLine) {
            System.out.println(minSumColumn);
        }
        else {
            System.out.println(minSumLine);
        }
    }
}
