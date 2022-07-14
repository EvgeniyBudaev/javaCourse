package javaRushUniversity.javaSyntax.level06.lesson02;

import java.util.Scanner;

/*
Минимум из введенных чисел
*/

/* Программа должна считывать целые числа с клавиатуры до тех пор, пока не будет введено что-то другое: например, строка
 или символ. Выведи на экран минимальное число из введенных. Если введено несколько таких чисел, необходимо вывести
 любое из них. */

public class Solution02 {
    public static void main(String[] args) {
        //напишите тут ваш код
        Scanner scanner = new Scanner(System.in);
        int min = Integer.MAX_VALUE;

        while (scanner.hasNextInt()) {
            int num = scanner.nextInt();
            if (num < min) {
                min = num;
            }
        }

        System.out.println(min);
    }
}
