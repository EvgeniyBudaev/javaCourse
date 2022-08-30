package javaRushUniversity.javaSyntax.level27.lesson01.task1; // com.javarush.task.pro.task16.task1604;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Locale;

/*
День недели рождения твоего
*/

public class Solution {

    static Calendar birthDate = new GregorianCalendar(1986, Calendar.NOVEMBER, 17);

    public static void main(String[] args) {
        System.out.println(getDayOfWeek(birthDate));
    }

    static String getDayOfWeek(Calendar calendar) {
        //напишите тут ваш код
        Locale localeRu = new Locale("ru","RU");
        return calendar.getDisplayName(Calendar.DAY_OF_WEEK,2,localeRu);
    }
}