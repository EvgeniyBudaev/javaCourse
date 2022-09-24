package yandex.sprint7.ZonedDateTime.task2;

import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

class Practicum {
    public static void main(String[] args) {
        Instant now = Instant.now();

        // укажите корректный формат вывода даты
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy; HH:mm:ss. ZZZZZ");

        // создайте экземпляр ZoneId для Москвы
        ZoneId moscowZone = ZoneId.of("Europe/Moscow");
        ZonedDateTime moscowDateTime = ZonedDateTime.ofInstant(now, moscowZone);

        printTime(formatter, moscowDateTime, "Москва");

        convertAndPrintTime(formatter, moscowDateTime, "Осло", "Europe/Oslo");
        convertAndPrintTime(formatter, moscowDateTime, "Чикаго", "America/Chicago");
        convertAndPrintTime(formatter, moscowDateTime, "Шанхай", "Asia/Shanghai");
        convertAndPrintTime(formatter, moscowDateTime, "Аддис-Абеба", "Africa/Addis_Ababa");
    }

    private static void convertAndPrintTime(DateTimeFormatter formatter, ZonedDateTime moscowDateTime, String cityName, String region) {
        ZoneId newZone = ZoneId.of(region); // создайте ZoneId из region
        ZonedDateTime newDateTime = moscowDateTime.withZoneSameInstant(newZone); // измените временную зону у moscowDateTime

        printTime(formatter, newDateTime, cityName);
    }

    private static void printTime(DateTimeFormatter formatter, ZonedDateTime dateTime, String cityName) {
        System.out.println(cityName + ":");
        // выведите dateTime в указанном в formatter формате
        System.out.println(dateTime.format(formatter));
    }
}
