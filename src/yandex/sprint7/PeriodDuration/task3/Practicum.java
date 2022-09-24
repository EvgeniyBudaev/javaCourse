package yandex.sprint7.PeriodDuration.task3;

import java.time.Duration;
import java.time.LocalDateTime;
import java.util.Random;

class Practicum {
    public static void main(String[] args) throws InterruptedException {
        Random random = new Random();

        // фиксируем начало выполнения кода
        LocalDateTime start = LocalDateTime.now();

        // производим действия, время исполнения которых хотим замерить
        int num = random.nextInt(5000);
        Thread.sleep(num); // останавливаем выполнение кода на произвольное время

        // фиксируем конец выполнения кода
        LocalDateTime finish = LocalDateTime.now();

        // находим продолжительность между двумя моментами
        Duration duration = Duration.between(start, finish);

        // выводим результат
        System.out.println("Код выполнился за " + duration.getSeconds() + "." + duration.getNano() + "с.");
    }
}