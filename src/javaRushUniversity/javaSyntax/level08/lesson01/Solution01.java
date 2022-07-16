package javaRushUniversity.javaSyntax.level08.lesson01;

/*
Треугольный массив
*/

/* Создай треугольный массив, где значение каждого элемента — это сумма его индексов. */

public class Solution01 {
    public static int[][] result = new int[10][];

    public static void main(String[] args) {
        //напишите тут ваш код
        for (int i = 0; i < result.length; i++) {
            result[i] = new int[i + 1];
            for (int j = 0; j < i + 1; j++) {
                result[i][j] = i + j;
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
    }
}
