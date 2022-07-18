package javaRushUniversity.javaSyntax.level04.lesson03; // task03.task0308;

import java.util.Scanner;

/*
Координатные четверти
*/

/* Ввести с клавиатуры два целых числа, которые будут координатами точки (первое считанное число - это координата "x",
 а второе - координата "y"). Известно, что точка не лежит на координатных осях OX и OY.
 Вывести на экран номер координатной четверти, в которой находится данная точка. */

public class Solution02 {
    public static void main(String[] args) {
        //напишите тут ваш код
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();

        if (x>0 && y>0) {
            System.out.println(1);
        } else if (x<0 && y>0) {
            System.out.println(2);
        } else if (x<0 && y<0) {
            System.out.println(3);
        } else {
            System.out.println(4);
        }
    }
}
