package javaRushUniversity.javaSyntax.level04.lesson06; // task03.task0314;

import java.util.Scanner;

/*
Сломанная клавиатура
*/

/* Амиго создал секретное слово для доступа к закрытой информации, но у него сломалась клавиатура, и теперь невозможно
 набирать буквы в верхнем регистре. Напиши программу, которая будет сравнивать введенную строку со строкой из переменной
 secret, не учитывая регистр.
Если введенная строка равна строке из переменной secret, программа выводит на экран сообщение "доступ разрешен". В ином
случае - "доступ запрещен". */

public class Solution03 {
    public static String secret = "AmIGo";

    public static void main(String[] args) {
        //напишите тут ваш код
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        if (text.equalsIgnoreCase(secret)) {
            System.out.println("доступ разрешен");
        } else {
            System.out.println("доступ запрещен");
        }
    }
}
