package javaRushUniversity.javaSyntax.level16.lesson01; // task12.task1205;

/*
Метод деления
*/

/* Реализуй метод divide(double a, double b) так, чтобы в консоли выводился результат деления числа a на число b. */

public class Solution02 {

    public static void main(String[] args) {
        divide(1, 0);
        divide(-1, 0);
        divide(0, 0);
        divide(100, 20);
        divide(200, 20);
    }

    public static void divide(double a, double b) {
        //напишите тут ваш код
        System.out.println(a / b);
    }
}
