package javaRushUniversity.javaSyntax.level27.lesson06.task1; // com.javarush.task.pro.task16.task1619;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/*
Простой шаблон
*/

public class Solution {

    static LocalDateTime localDateTime = LocalDateTime.now();

    public static void main(String[] args) {
        //напишите тут ваш код
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd.MM.yyyyг. Hч.mмин");
        String text = dtf.format(localDateTime);
        System.out.println(text);
    }
}