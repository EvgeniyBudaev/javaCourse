package javaRushUniversity.javaSyntax.level27.lesson05.task3; // com.javarush.task.pro.task16.task1618;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

/*
Лишь бы не запутаться
*/

public class Solution {

    public static void main(String[] args) {
        ZoneId zone1 = ZoneId.of("Zulu");
        ZoneId zone2 = ZoneId.of("Etc/GMT+8");
        System.out.println(ZonedDateTime.now(zone1));
        System.out.println(ZonedDateTime.now(zone2));

        LocalDateTime time = changeZone(LocalDateTime.of(2020, 3, 19, 1, 40), zone1, zone2);
        System.out.println(time);
    }

    static LocalDateTime changeZone(LocalDateTime fromDateTime, ZoneId fromZone, ZoneId toZone) {
        //напишите тут ваш код
        int offset1 = fromZone.getRules().getOffset(fromDateTime).getTotalSeconds();
        int offset2 = toZone.getRules().getOffset(fromDateTime).getTotalSeconds();
        return fromDateTime.plusSeconds(offset2 - offset1);
    }
}