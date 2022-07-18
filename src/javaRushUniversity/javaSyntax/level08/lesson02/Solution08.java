package javaRushUniversity.javaSyntax.level08.lesson02; // task06.task0634;

import java.util.Scanner;

/*
Шахматная доска
*/

/* Давай создадим программу для генерации квадратных шахматных досок с заданной размерностью. В классе Solution дан
 двумерный массив символов (поле array). Необходимо:

    считать число с клавиатуры — это и будет размерность нашей будущей доски (длина стороны);
    инициализировать массив array соответствующим значением;
    "закрасить" массив так, чтобы получилась шахматная доска (черные клетки — '#', белые — ' '). Начинаем заполнять
     массив с '#' с верхнего левого угла;
    вывести массив на экран в таком виде, как в примере (каждую строку отдельно). */

public class Solution08 {
    public static char[][] array;

    public static void main(String[] args) {
        //напишите тут ваш код
        Scanner scanner = new Scanner(System.in);
        int length = scanner.nextInt();
        array = new char[length][length];

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (i % 2 == 0 && j % 2 == 0) {
                    array[i][j] = '#';
                } else if (i % 2 != 0 && j % 2 != 0) {
                    array[i][j] = '#';
                } else {
                    array[i][j] = ' ';
                }
            }
        }

        printArray();
    }

    private static void printArray() {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j]);
            }
            System.out.println();
        }
    }
}
