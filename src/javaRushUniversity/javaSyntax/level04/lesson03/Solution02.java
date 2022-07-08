package javaRushUniversity.javaSyntax.level04.lesson03;

import java.util.Scanner;

/*
Три числа
*/

/* Ввести с клавиатуры три целых числа. Определить, есть ли среди них хотя бы одна пара равных между собой чисел.
Если такая пара существует, вывести на экран числа через пробел. Если все три числа равны между собой, то вывести все
три. */

public class Solution02 {
    public static void main(String[] args) {
        //напишите тут ваш код
        Scanner scanner =new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        if (a==b)
        {
            if (a==c)
                System.out.print(a + " " + b + " " + c);
            else
                System.out.print(a + " " + b);
        }
        else
        {
            if (a==c)
                System.out.print(a + " " + c);
            if (b==c)
                System.out.print(b + " " + c);
        }
    }
}
