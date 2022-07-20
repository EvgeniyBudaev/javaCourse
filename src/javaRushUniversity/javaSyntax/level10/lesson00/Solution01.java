package javaRushUniversity.javaSyntax.level10.lesson00; // task06.task0614;

/*
Вспоминаем геометрию
*/

/* Посмотри, что делает программа. Расставь модификатор final общепринятым константам
 (переменным с неизменными значениями). */

public class Solution01 {
    public static final double pi = 3.14;
    public static double radius = 2.5;
    public static double diameter = 5;

    public static void main(String[] args) {
        System.out.println("Плошадь круга равна: " + pi * radius * radius);
        System.out.println("Периметр круга равен: " + pi * diameter);
    }
}
