package javaRushUniversity.javaSyntax.level21.lesson02.task1; // task14.task1406;

import java.util.Scanner;

/*
Купи слона
*/

/* Разберись, что делает программа.
В блоке catch выведи на экран переменную answer и брось дальше пойманное исключение. */

class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        buyElephant(null, scanner);
    }

    static void buyElephant(String answer, Scanner scanner) {
        if (answer == null) {
            System.out.println("Купи слона");
        } else if (answer.toLowerCase().equals("ок")) {
            System.out.println("Так-то лучше :) Список твоих отговорок:");
            throw new SecurityException();
        } else {
            System.out.println("Все говорят \"" + answer + "\", а ты купи слона");
        }

        answer = scanner.nextLine();

        try {
            buyElephant(answer, scanner);
        } catch (Exception e) {
            //напишите тут ваш код
            System.out.println(answer);
            throw e;
        }
    }
}