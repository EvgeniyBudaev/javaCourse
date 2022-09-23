package yandex.sprint7.DateTime.task2;

import java.time.Instant;
import java.util.Scanner;

class Practicum {

    public static final int ONE_SECOND_MILLIS = 1000;
    public static final int ONE_MINUTE_MILLIS = 60 * 1000;
    public static final int ONE_HOUR_SECONDS = 60 * 60;
    public static final int ONE_HOUR_MILLIS = ONE_HOUR_SECONDS * 1000;
    public static final int ONE_DAY_SECONDS = 60 * 60 * 24;
    public static final int ONE_DAY_MILLIS = ONE_DAY_SECONDS * 1000;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите отметку времени начала экзамена (в миллисекундах):");
        long examStartMillis = scanner.nextLong();
        // Сконвертируйте введённое значение миллисекунд в экземпляр класса Instant
        Instant examStart = Instant.ofEpochMilli(examStartMillis);
        System.out.println("Введено " + examStart);

        System.out.println("Введите отметку текущего времени (в миллисекундах):");
        long currentTimeMillis = scanner.nextLong();
        // Сконвертируйте введённое значение миллисекунд в экземпляр класса Instant
        Instant currentTime = Instant.ofEpochMilli(currentTimeMillis);
        System.out.println("Введено " + currentTime);

        // Вычислите время, в которое нужно проснуться
        Instant timeToWakeUp = examStart.minusSeconds(ONE_HOUR_SECONDS);
        // Проверьте, что текущее время не позже времени пробуждения
        if (currentTime.isAfter(timeToWakeUp)) {
            System.out.println("На экзамен уже не успеть, готовься к пересдаче!");
            return;
        }

        // Проверьте, что до времени пробуждения не больше 24 часов
        if (currentTime.plusSeconds(ONE_DAY_SECONDS).isBefore(examStart)) {
            System.out.printf("Дней до экзамена: %.0f. До экзамена ещё слишком далеко, волноваться не о чем!%n", calculateDuration(currentTime, examStart, TimeUnits.DAYS));
            return;
        }


        System.out.println("Введите желаемую продолжительность сна (в часах):");
        long sleepGoalHours = scanner.nextLong();

        // Проверьте, что введённое количество часов -- положительное
        if (sleepGoalHours <= 0) {
            System.out.println("Надо поспать хоть сколько-то!");
            return;
        }

        // Вычислите время, в которое нужно ложиться спать
        Instant timeToGoToSleep = timeToWakeUp.minusMillis((long) sleepGoalHours * ONE_HOUR_MILLIS);
        if (currentTime.isAfter(timeToGoToSleep)) {
            System.out.println("Такое количество времени поспать уже не получится!");
            return;
        }

        System.out.printf("На учёбу остаётся: %.0f мс.%n", calculateDuration(currentTime, timeToGoToSleep, TimeUnits.MILLIS));
        System.out.printf(
                "Это %.2f мин. или %.2f ч.%n",
                calculateDuration(currentTime, timeToGoToSleep, TimeUnits.MINUTES),
        calculateDuration(currentTime, timeToGoToSleep, TimeUnits.HOURS)
        );
        System.out.printf("Ведь проснуться нужно уже через %.2f ч.%n", calculateDuration(currentTime, timeToWakeUp, TimeUnits.HOURS));
    }

    // Вычислите продолжительность в указанных единицах времени
    // Воспользуйтесь константами
    private static double calculateDuration(Instant firstMoment, Instant secondMoment, TimeUnits unit) {
        switch (unit) {
            case MILLIS: {
                return secondMoment.toEpochMilli() - firstMoment.toEpochMilli();
            }
            case SECONDS: {
                return (double)(secondMoment.toEpochMilli() - firstMoment.toEpochMilli()) / ONE_SECOND_MILLIS;
            }
            case MINUTES: {
                return (double)(secondMoment.toEpochMilli() - firstMoment.toEpochMilli()) / ONE_MINUTE_MILLIS;
            }
            case HOURS: {
                return (double)(secondMoment.toEpochMilli() - firstMoment.toEpochMilli()) / ONE_HOUR_MILLIS;
            }
            case DAYS: {
                return (double)(secondMoment.toEpochMilli() - firstMoment.toEpochMilli()) / ONE_DAY_MILLIS;
            }
            default:
                return 0;
        }
    }
}

enum TimeUnits {
    MILLIS,
    SECONDS,
    MINUTES,
    HOURS,
    DAYS
}