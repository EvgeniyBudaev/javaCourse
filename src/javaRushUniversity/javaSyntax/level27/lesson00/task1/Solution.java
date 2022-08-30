package javaRushUniversity.javaSyntax.level27.lesson00.task1; // com.javarush.task.pro.task16.task1601;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

/*
Лишь бы не в понедельник :)
*/

public class Solution {

    static Date birthDate = new Date("Nov 17 1986");

    public static void main(String[] args) {
        System.out.println(getDayOfWeek(birthDate));
    }

    static String getDayOfWeek(Date date) {
        //напишите тут ваш код

        return new SimpleDateFormat("EEEE", Locale.forLanguageTag("ru")).format(date);
    }
}
