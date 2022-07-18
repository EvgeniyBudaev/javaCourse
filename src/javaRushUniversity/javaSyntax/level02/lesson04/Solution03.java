package javaRushUniversity.javaSyntax.level02.lesson04; // task02.task0212;

/*
Попрошу регистр на меня не повышать!
*/

/* В методе main на экран выводятся три строки.
Внеси изменения в код, чтобы все буквы в этих строках стали заглавными. */

public class Solution03 {
    public static void main(String[] args) {
        String caps = "if I type in caps ";
        String usa = "сша";

        //напишите тут ваш код
        System.out.println(usa.toUpperCase());
        System.out.println("Винни Пух".toUpperCase());
        System.out.println((caps + "they know I mean business").toUpperCase());
    }
}
