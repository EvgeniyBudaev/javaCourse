package javaRushUniversity.javaSyntax.level11.lesson05; // task05.task0517;

import java.util.Arrays;

/*
Делим массив
*/

/* Реализуй метод main(String[]), который делит массив array на два подмассива и заполняет ими двумерный массив result.
Если длина массива нечетная, то большую часть нужно скопировать в первый подмассив.
Для разделения массива используй метод Arrays.copyOfRange(int[], int, int). Порядок элементов не меняй.
При тестировании значения полей класса Solution будут разными, учти это. */

public class Solution02 {
    public static int[][] result = new int[2][];
    public static int[] array = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11};

    public static void main(String[] args) {
        //напишите тут ваш код
        int i = array.length/2 + array.length%2;
        result[0] = Arrays.copyOfRange(array, 0, i);
        result[1] = Arrays.copyOfRange(array, i, array.length);
        System.out.println(Arrays.deepToString(result));
    }
}
