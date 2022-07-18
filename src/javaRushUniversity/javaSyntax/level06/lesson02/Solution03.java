package javaRushUniversity.javaSyntax.level06.lesson02; // task04.task0410;

import java.util.Scanner;

/*
Второе минимальное число из введенных
*/

/* В этой задаче нужно:

    Считывать целые числа с клавиатуры до тех пор, пока не будет введено что-то другое: например, строка или символ.
    Должно быть введено минимум два числа. Если введено меньше двух целых чисел, то такую ситуацию обрабатывать не
    нужно, а программа может быть завершена с ошибкой.
    Вывести на экран второе по величине целое число после минимального из введенных с клавиатуры. Если таких чисел
    несколько, то необходимо вывести любое из них.
    Минимальных чисел тоже может быть несколько. */

public class Solution03 {
    public static void main(String[] args) {
        //напишите тут ваш код
        Scanner scanner = new Scanner(System.in);
        int firstMinimum = Integer.MAX_VALUE;
        int secondMinimum = Integer.MAX_VALUE;

        while (scanner.hasNextInt()) {
            int number = scanner.nextInt();
            if (number < firstMinimum) {
                secondMinimum = firstMinimum;
                firstMinimum = number;
            } else if (number > firstMinimum && number <= secondMinimum){
                secondMinimum = number;
            }
        }

        System.out.println(secondMinimum);
    }
}
