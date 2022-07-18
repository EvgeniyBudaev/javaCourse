package javaRushUniversity.javaSyntax.level07.lesson01; // task05.task0504;

/*
Объединяем массивы
*/

/* Реализовать метод main(String[]), в котором нужно скопировать содержимое массивов firstArray и secondArray в один
 массив resultArray. Массив firstArray должен быть в начале нового массива resultArray, а secondArray — после него.
 Программа должна правильно обрабатывать массивы любой длины. */

import java.util.Arrays;

public class Solution01 {
    public static int[] firstArray = new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
    public static int[] secondArray = new int[]{10, 11, 12, 13, 14, 15, 16, 17, 18, 19};
    public static int[] resultArray;

    public static void main(String[] args) {
        //напишите тут ваш код
        int newArrayLength = firstArray.length + secondArray.length;
        resultArray = new int[newArrayLength];

        for (int i = 0; i < resultArray.length; i++) {
            resultArray[i] = i < firstArray.length ? firstArray[i] : secondArray[i - firstArray.length];
            System.out.print(resultArray[i] + ", ");
        }
    }
}
