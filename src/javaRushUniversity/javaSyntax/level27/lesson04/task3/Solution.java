package javaRushUniversity.javaSyntax.level27.lesson04.task3; // com.javarush.task.pro.task16.task1614;

import java.time.Instant;

/*
Конец времен
*/

public class Solution {

    public static void main(String[] args) {
        System.out.println(getMaxFromMilliseconds());
        System.out.println(getMaxFromSeconds());
        System.out.println(getMaxFromSecondsAndNanos());
    }

    static Instant getMaxFromMilliseconds() {
        //напишите тут ваш код
        try {
            return Instant.ofEpochMilli(Long.MAX_VALUE);
        } catch (ArithmeticException e) {
            long n = Long.MAX_VALUE;
            return Instant.ofEpochMilli(n);
        }

    }

    static Instant getMaxFromSeconds() {
        //напишите тут ваш код
        try {
            return Instant.ofEpochSecond(Instant.MAX.getEpochSecond());
        } catch (ArithmeticException e) {
            long n = Long.MAX_VALUE;
            return Instant.ofEpochSecond(n);
        }
    }

    static Instant getMaxFromSecondsAndNanos() {
        //напишите тут ваш код
        try {
            return Instant.ofEpochSecond(Instant.MAX.getEpochSecond(), 999_999_999);
        } catch (ArithmeticException e) {
            long n = Long.MAX_VALUE;
            return Instant.ofEpochSecond(n);
        }
    }
}
