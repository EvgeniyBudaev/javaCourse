package javaRushUniversity.javaSyntax.level27.lesson06.task2; // com.javarush.task.pro.task16.task1620;

import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

/*
Еще один простой шаблон
*/

public class Solution {

    static ZonedDateTime zonedDateTime = ZonedDateTime.now();

    public static void main(String[] args) {
        //напишите тут ваш код
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("e d.M.yy HH:mm:ss.n VV");
        String text = dtf.format(zonedDateTime);
        System.out.println(text);
    }
}