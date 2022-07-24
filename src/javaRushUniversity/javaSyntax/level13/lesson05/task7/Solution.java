package javaRushUniversity.javaSyntax.level13.lesson05.task7; // task10.task1018;

/*
Геттер и сеттер в деле
*/

/* В классе Coordinate есть 2 геттера и 2 сеттера, но значения переменным сеттеры не устанавливают.
Разберись, почему так происходит и исправь. Метод main не участвует в проверке. */

public class Solution {

    public static void main(String[] args) {
        Coordinate coordinate = new Coordinate();
        coordinate.setX(15);
        coordinate.setY(25);
        System.out.println(coordinate.getX());
        System.out.println(coordinate.getY());
    }
}
