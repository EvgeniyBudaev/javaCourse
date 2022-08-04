package javaRushUniversity.javaSyntax.level21.lesson03.task3; // task14.task1412;

/*
Группировка исключений
*/

/* Объедини блоки catch с одинаковым кодом. */

public class Solution {

    public static void main(String[] args) {
        try {
            System.out.println("Программа работает от забора");
            Thread.sleep(1000);
            System.out.println("до обеда");
        } catch (NullPointerException | NumberFormatException e) {
            System.out.println("Произошло исключение на букву N");
        } catch (IllegalArgumentException | IllegalStateException | InterruptedException e) {
            System.out.println("Произошло исключение на букву I");
        } catch (ClassCastException e) {
            System.out.println("Произошло исключение на букву C");
        }
    }
}