package javaRushUniversity.javaSyntax.level12.lesson02; // task07.task0711;

import java.util.Arrays;

/*
Гибкое заполнение массива
*/

/* Иногда необходимо заполнить какую-то часть массива одинаковыми значениями или же удалить существующие (присвоить
значение null). Реализуй для этого более гибкий метод fillArray(Integer[] array, int value, int begin, int end), где:

    array — массив, который необходимо заполнить;
    value — значение, которым необходимо заполнить;
    begin — начиная с какого индекса необходимо заполнять (включительно);
    end — на каком индексе остановить заполнение (исключая). */

public class Solution02 {
    public static void main(String[] args) {
        Integer[] array = new Integer[5];
        fillArray(array, 3, 1, 3);
        System.out.println(Arrays.toString(array));
    }

    public static void fillArray(Integer[] array, int value, int begin, int end) {
        //напишите тут ваш код
        for (int i = 0; i < array.length; i++) {
            if (i < begin) {
                continue;
            } else if (i >= end) {
                continue;
            } else {
                array[i] = value;
            }
        }
    }
}
