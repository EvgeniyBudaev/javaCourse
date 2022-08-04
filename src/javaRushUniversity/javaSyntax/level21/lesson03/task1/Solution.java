package javaRushUniversity.javaSyntax.level21.lesson03.task1; // task14.task1408;

/*
Проглатываем исключение
*/

/* Перехвати исключение в методе main, чтобы программа компилировалась. При возникновении исключения нужно вывести на
экран строку errorMessage. */

public class Solution {

    public static String errorMessage = "не повезло";

    public static void main(String[] args) {
        try {
            generateLuckyNumber();
        } catch (Exception e) {
            System.out.println(errorMessage);
        }
    }

    static void generateLuckyNumber() throws Exception {
        int luckyNumber = (int) (Math.random() * 100);
        if (luckyNumber == 13) {
            throw new Exception();
        }
        System.out.println("твое счастливое число: " + luckyNumber);
    }
}