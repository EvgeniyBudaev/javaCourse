package javaRushUniversity.javaSyntax.level11.lesson03; // task09.task0919;

/*
Разворот строки
*/

/* Используя StringBuilder в методе reverseString(String), разверни строку, полученную как параметр. */

public class Solution02 {
    public static void main(String[] args) {
        String string = "Ходит кот задом наперед";
        System.out.println(string);
        System.out.println(reverseString(string));
    }

    public static String reverseString(String string) {
        //напишите тут ваш код
        StringBuilder builder = new StringBuilder(string);
        return builder.reverse().toString();
    }
}
