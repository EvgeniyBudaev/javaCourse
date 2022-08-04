package javaRushUniversity.javaSyntax.level21.lesson03.task2; // task14.task1409;

/*
Пропускаем сквозь себя
*/

/* Сделай так, чтобы программа компилировалась, не используя try-catch. */

public class Solution {

    public static void main(String[] args) throws Exception {
        generateLuckyNumber();
    }

    static void generateLuckyNumber() throws Exception {
        int luckyNumber = (int) (Math.random() * 100);
        if (luckyNumber == 13) {
            throw new Exception("не повезло");
        }
        System.out.println("твое счастливое число: " + luckyNumber);
    }
}

