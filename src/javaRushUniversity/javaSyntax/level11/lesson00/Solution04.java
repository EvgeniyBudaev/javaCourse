package javaRushUniversity.javaSyntax.level11.lesson00; // task09.task0904;

/*
Символьные литералы
*/

/* В классе Solution объявлены четыре публичных символьных поля. Им присвоены некоторые значения. Но программа не
компилируется. Нужно это исправить, не меняя значения символов.
Все поля статические (static) — это нужно, чтобы в методе main() получить к ним доступ. */

public class Solution04 {
    public static char first = '\u004A';
    public static char second = 'a';
    public static char third = '\u0076';
    public static char fourth = 'a';

    public static void main(String[] args) {
        System.out.print(first);
        System.out.print(second);
        System.out.print(third);
        System.out.print(fourth);
    }
}
