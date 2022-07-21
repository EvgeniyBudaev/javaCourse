package javaRushUniversity.javaSyntax.level11.lesson05; // task05.task0516;

import java.util.Arrays;

/*
Заполняем массив
*/

/* Реализуй статический метод main(String[]), который заполняет массив array значениями valueStart и valueEnd.
Если длина массива четная, его первую половину нужно заполнить значениями valueStart, а вторую — valueEnd. Если длина
массива нечётная, то первую большую часть заполнить значениями valueStart, вторую меньшую — valueEnd. Для заполнения
массива используй метод Arrays.fill(int[], int, int, int).
При тестировании значения полей класса Solution будут разными, учти это. */

public class Solution01 {
    public static int[] array = new int[5];
    public static int valueStart = 10;
    public static int valueEnd = 13;

    public static void main(String[] args) {
        //напишите тут ваш код
        int i = array.length;
        int h = (array.length / 2) + ((array.length) % 2);
        Arrays.fill(array, 0, h, valueStart);
        Arrays.fill(array, h, i, valueEnd);
        System.out.println(Arrays.toString(array));
    }
}
