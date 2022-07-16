package javaRushUniversity.javaSyntax.level08.lesson01;

import java.util.Arrays;
import java.util.Scanner;

/*
Создаем двумерный массив
*/

/* Для этого реализуй метод main(String[]), который:

    Считывает из консоли число N — количество строк массива (считай, что это число будет больше 0, можно не проверять).
    Считывает N чисел из консоли (любые числа, которые будут больше 0, можно не проверять).
    Инициализирует двумерный массив multiArray:
        количеством строк N;
        строки — массивами, размер которых соответствует числам, введенным в п.2 (в порядке ввода). */

public class Solution02 {
    public static int[][] multiArray;

    public static void main(String[] args) {
        //напишите тут ваш код
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        multiArray = new int[N][];

        for (int i = 0; i < multiArray.length; i++) {
            int x = scanner.nextInt();
            multiArray[i] = new int[x];
        }

        System.out.println(Arrays.toString(multiArray));
    }
}
