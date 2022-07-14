package javaRushUniversity.javaSyntax.level06.lesson02;

import java.util.Scanner;

/*
Максимум из введенных чисел
*/

/* Программа должна считывать целые числа с клавиатуры до тех пор, пока не будет введено что-то другое: например,
 строка или символ. Выведи на экран максимальное четное число из введенных. Если введено несколько таких чисел,
 необходимо вывести любое из них. */

public class Solution01 {
    public static void main(String[] args) {
        //напишите тут ваш код
        Scanner scanner = new Scanner(System.in);
        int max = Integer.MIN_VALUE;

        while (scanner.hasNextInt()) {
            int num = scanner.nextInt();
            if (num > max) {
                if (num % 2 == 0) {
                    max = num;
                }
            }
        }

        System.out.println(max);
    }
}
