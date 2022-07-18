package javaRushUniversity.javaSyntax.level08.lesson02; // task06.task0633;

/*
Вырезаем середину
*/

/* Дан двумерный массив chars. Тебе нужно в методе main заменить все внутренние элементы на дефис (минус).

Для вывода содержимого массива на экран используй приватный метод printArray(). */

public class Solution07 {
    public static char[][] chars = {
            {'a', 'b', 'c', 'd', 'e', 'f'},
            {'j', 'h', 'i', 'j', 'k', 'l'},
            {'m', 'n', 'o', 'p', 'q', 'r'},
            {'s', 't', 'u', 'v', 'w', 'x'}};

    public static void main(String[] args) {
        //напишите тут ваш код
        for (int i = 0; i < chars.length; i++) {
            for (int j = 0; j < chars[i].length; j++) {
                if (i != 0 && i != chars.length - 1 && j != 0 && j != chars[i].length - 1) {
                    chars[i][j] = '-';
                }
            }
        }

        printArray();
    }

    private static void printArray() {
        for (int i = 0; i < chars.length; i++) {
            for (int j = 0; j < chars[i].length; j++) {
                System.out.print(chars[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
}
