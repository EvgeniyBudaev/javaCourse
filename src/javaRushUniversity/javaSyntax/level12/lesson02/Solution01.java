package javaRushUniversity.javaSyntax.level12.lesson02; // task07.task0710;

import java.util.Arrays;

/*
Массив значений
*/

/* Часто перед началом использования массива его необходимо заполнить значениями по умолчанию. Реализуй такое заполнение
в методе fillArray(Integer[] array, int value). В качестве аргументов метод принимает массив и значение, которым его
необходимо заполнить. Массив заполняется полностью, независимо от его длины. */

public class Solution01 {
    public static void main(String[] args) {
        Integer[] array = new Integer[5];
        fillArray(array, 3);
        System.out.println(Arrays.toString(array));
    }

    public static void fillArray(Integer[] array, int value){
        //напишите тут ваш код
        for (int i = 0; i < array.length; i++) {
            array[i] = value;
        }
    }
}
