package javaRushUniversity.javaSyntax.level27.lesson05.task1; // com.javarush.task.pro.task16.task1616;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Set;
import java.util.TreeSet;

/*
Тренировка временных зон
*/

public class Solution {

    public static void main(String[] args) {
        TreeSet<String> sortedZones = getSortedZones();
        System.out.println(sortedZones.size());
        System.out.println(sortedZones.first());
        System.out.println(sortedZones.last());

        System.out.println(getBeijingDateTime());
    }

    static TreeSet<String> getSortedZones() {
        //напишите тут ваш код

        return new TreeSet<>(ZoneId.getAvailableZoneIds());
    }

    static ZonedDateTime getBeijingDateTime() {
        //напишите тут ваш код
        ZoneId zone = ZoneId.of("Asia/Shanghai");

        return ZonedDateTime.now(zone);
    }
}
