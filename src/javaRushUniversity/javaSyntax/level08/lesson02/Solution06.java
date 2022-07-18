package javaRushUniversity.javaSyntax.level08.lesson02; // task06.task0632;

import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

/*
Пирамида
*/

/* Напишем программу для рисования пирамиды с заданной высотой.
В классе Solution дан двумерный массив символов (поле array). Необходимо:

    считать число с клавиатуры — это и будет высота пирамиды;
    инициализировать массив array соответствующим значением;
    заполнить массив так, чтобы получилась пирамида (клетки, составляющие пирамиду, заполнить символами '#', фон - ' ',
     см. пример);  вывести массив на экран в таком виде, как в примере (каждую строку отдельно). */

public class Solution06 {
    public static String[][] array;

    public static void main(String[] args) throws IOException {
        //напишите тут ваш код
        Scanner scanner = new Scanner(System.in);
        int height = scanner.nextInt();
        array = new String[height][height * 2 - 1];

        for (int i = 0; i < array.length; i++) {
            for(int x = 1; x <= height - i; x++) {
                array[i][x] = " ";
            }

            for(int k = 0; k < i * 2 - 1; k++) {
                array[i][k] = "#";
            }

        }

        for (int i = 0; i < array.length; i++) {
            System.out.println(Arrays.toString(array[i]));
        }
    }
}
