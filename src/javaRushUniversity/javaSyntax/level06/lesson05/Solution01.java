package javaRushUniversity.javaSyntax.level06.lesson05;

import java.util.Scanner;

/*
Хорошего не бывает много
*/

/*  Ввести с клавиатуры строку и число number, которое больше 0 и меньше 5.
    Вывести на экран строку number раз с помощью цикла do-while. Каждое значение нужно вывести с новой строки.
    Если число number меньше/равно 0 или больше/равно 5, то введенную строку нужно вывести на экран один раз. */

public class Solution01 {
    public static void main(String[] args) {
        //напишите тут ваш код
        Scanner scanner = new Scanner(System.in);
        int x = 0;
        String str = scanner.nextLine();
        int number = scanner.nextInt();

        if (number <= 0 || number >= 5) {
            System.out.println(str);
        } else {
            do {
                System.out.println(str);
                x++;
            } while (x < number);
        }
    }
}
