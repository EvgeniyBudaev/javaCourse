package yandex.sprint7.PeriodDuration.task2;

import java.time.Duration;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;


class Practicum {
    public static void main(String[] args) {
        // время начала работы над задачей — 9:00
        LocalTime taskStart = LocalTime.of(9, 0);
        // время окончания работы над задачей — 11:30
        LocalTime taskFinish = LocalTime.of(11, 30);

        // опишите формат вывода в виде часы:минуты
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm");

        // найдите продолжительность между двумя единицами времени
        Duration duration = Duration.between(taskStart, taskFinish);

        // taskStart должен быть выведен в указанном формате
        System.out.println("В прошлый раз задача была начата в " + taskStart.format(formatter) + ",");
        // taskFinish должен быть выведен в указанном формате
        System.out.println("а закончена в " + taskFinish.format(formatter) + ".");

        LocalTime now = LocalTime.now();
        // now должен быть выведен в указанном формате
        System.out.println("Сейчас " + now.format(formatter) + ".");

        // прибавьте к текущему моменту вычисленную продолжительность
        LocalTime finishTime = now.plus(duration);

        // finishTime должен быть выведен в указанном формате
        System.out.println("Значит, задача будет выполнена к " + finishTime.format(formatter) + ".");
    }
}