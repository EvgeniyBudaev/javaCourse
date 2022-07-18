package javaRushUniversity.javaSyntax.level07.lesson03; // task05.task0508;

import java.util.Scanner;

/*
Удаляем одинаковые строки
*/

/* В этой задаче тебе нужно:
    Считать 6 строк и заполнить ими массив strings.
    Удалить повторяющиеся строки из массива strings, заменив их на null (null должны быть не строками "null"). */

public class Solution01 {
    public static String[] strings;

    public static void main(String[] args) {
        //напишите тут ваш код
        Scanner scanner = new Scanner(System.in);
        strings = new String[6];

        for (int i = 0; i < strings.length; i++) {
            strings[i] = scanner.nextLine();
        }

        for (int i = 0; i < strings.length; i++) {
            String s = strings[i];
            if (strings[i] != null) {
                for (int j = 0; j < strings.length; j++) {
                    if (s.equals(strings[j]) && i != j) {
                        strings[j] = null;
                        strings[i] = null;
                    }
                }
            }
            System.out.print(strings[i] + ", ");
        }
    }
}
