package javaRushUniversity.javaSyntax.level03.lesson03;

import java.util.Scanner;

/*
Чтение и преобразование строк
*/

/* Считай с клавиатуры три строки.
А затем:

    1. Выведи на экран третью строку в неизменном виде.
    2. Выведи на экран вторую строку, предварительно преобразовав ее к верхнему регистру.
    3. ыведи на экран первую строку, предварительно преобразовав ее к нижнему регистру. */

public class Solution02 {
    public static void main(String[] args) {
        //напишите тут ваш код
        Scanner scanner = new Scanner(System.in);
        String str1 = scanner.nextLine();
        String str2 = scanner.nextLine();
        String str3 = scanner.nextLine();
        System.out.println(str3);
        System.out.println(str2.toUpperCase());
        System.out.println(str1.toLowerCase());
    }
}
