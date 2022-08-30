package javaRushUniversity.javaSyntax.level27.lesson02.task1; // com.javarush.task.pro.task16.task1607;

import java.time.LocalDate;
import java.time.Month;

/*
Освоение нового API
*/

public class Solution {

    public static void main(String[] args) {
        System.out.println(nowExample());
        System.out.println(ofExample());
        System.out.println(ofYearDayExample());
        System.out.println(ofEpochDayExample());
    }

    static LocalDate nowExample() {
        //напишите тут ваш код

        return LocalDate.now();
    }

    static LocalDate ofExample() {
        //напишите тут ваш код

        return LocalDate.of(2020, Month.SEPTEMBER, 12);
    }

    static LocalDate ofYearDayExample() {
        //напишите тут ваш код
        final LocalDate programmersDay2020 = LocalDate.of(2020, Month.SEPTEMBER, 12);
        //System.out.println(Integer.toHexString(programmersDay2020.getDayOfYear())); // 100

        return LocalDate.ofYearDay(2020, programmersDay2020.getDayOfYear());
    }

    static LocalDate ofEpochDayExample() {
        //напишите тут ваш код

        return LocalDate.ofEpochDay(LocalDate.of(2020,9,12).toEpochDay() );
    }
}
