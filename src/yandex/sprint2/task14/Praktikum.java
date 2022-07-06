package yandex.sprint2.task14;

import java.util.Random;
import java.util.Scanner;

public class Praktikum {
    public static void main(String[] args) {
        CarProperties userCarProperties =
                new CarProperties(
                        "100",
                        0.7f,
                        2
                );

        Car userCar = createCarByProperties(userCarProperties);
        System.out.println("Давно тебя не было в Яндекс.Гонках!");
        System.out.println("Характеристики твоего автомобиля:");
        // Напечайте характеристики автомобиля игрока
        System.out.println("- Максимальная скорость: " + userCar.maxSpeed);
        System.out.println("- Ускорение: " + userCar.acceleration);
        System.out.println("- Закись азота: " + userCar.nitroLevel);

        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Что выберете?");
            System.out.println("1 - Устроить заезд");
            System.out.println("2 - Показать статистику");
            System.out.println("3 - Закончить игру");
            int command = scanner.nextInt();

            if (command == 1) {
                Car opponentCar = generateOpponentCar();
                System.out.println("Характеристики автомобиля соперника:");
                // Напечайте характеристики автомобиля соперника
                System.out.println("- Максимальная скорость: " + opponentCar.maxSpeed);
                System.out.println("- Ускорение: " + opponentCar.acceleration);
                System.out.println("- Закись азота: " + opponentCar.nitroLevel);

                int distance = generateInt(5, 70);
                System.out.println("Гонка будет проходить на дистанции: " + distance + " км.");

                int points = makeRace(userCar, opponentCar, distance);
                changePointAndDistance(userCar, points, distance); // передайте в метод аргументы

            } else if (command == 2) {
                // Напечайте количество заработанных очков и пройденных километров
                System.out.println("- Количество заработанных очков: " + userCar.score);
                System.out.println("- Пройдено километров на этом авто: " + userCar.kilometersTravelled);
            } else if (command == 3) {
                System.out.println("Увидимся!");
                break;
            }
        }
    }

    private static void changePointAndDistance(Car car, int points, int distance) { // реализуйте метод
        // В результате выполнения метода у userCar количество очков должно увеличиться
        // на значение points, пройденное расстояние - на значение distance.
        car.score += points;
        car.kilometersTravelled += distance;
    }

    private static int makeRace(Car userCar, Car opponentCar, int distance) {
        printFlag();
        // Напишите логические выражения для определения победителя
        boolean shortRaceWin = (distance <= 15) && (userCar.acceleration > opponentCar.acceleration); // на короткой дистанции
        boolean longRaceWin = (distance > 50) && (userCar.maxSpeed > opponentCar.maxSpeed); // на длинной дистанции

        if (shortRaceWin || longRaceWin) { // если победил на короткой или на длинной дистанции
            System.out.println("Вы выиграли!");
            // Найдите и верните наибольшее из максимальных скоростей
            return (int) Double.max(userCar.maxSpeed, opponentCar.maxSpeed);
        } else if (userCar.acceleration == opponentCar.acceleration) { // Уровни ускорения должны быть равны
            System.out.println("Ничья!");
            return (int) userCar.maxSpeed;
        } else {
            // Сравните уровни закиси азота
            if (userCar.nitroLevel > opponentCar.nitroLevel) {
                System.out.println("Вы проиграли, но благодаря закиси азота сохранили очки.");
                return (int) userCar.maxSpeed;
            } else {
                System.out.println("Вы проиграли(");
                return (int) opponentCar.maxSpeed;
            }
        }
    }
    private static void printFlag() { // Метод печатает флаг
        System.out.println("_\n" +
                "\\'-,,.\n" +
                " \\    \\\n" +
                "  \\-..,\\\n" +
                "   \\\n" +
                "    \\\n");
    }
    // Метод генерирует авто противника
    private static Car generateOpponentCar() {
        // С помощью метода generateInt() генерируем число от 75 до 125
        double maxSpeed = generateInt(75, 125);
        // Чтобы создать число от 0.4 до 1, с помощью метода generateInt() генерируем число от 4 до 10,
        // после чего делим его на 10
        float acceleration = generateInt(4, 10) / 10.0f;
        int score = 0;
        // С помощью метода generateInt() генерируем число от 1 до 5
        Integer nitroLevel = generateInt(1, 5);

        return new Car(
                maxSpeed,
                acceleration,
                score,
                nitroLevel
        );
    }

    // Этот метод создаёт случайное число в промежутке от from до to
    private static int generateInt(int from, int to) {
        int diapason = to - from;
        int offence = new Random().nextInt(diapason);
        return from + offence;
    }

    private static Car createCarByProperties(CarProperties carProperties) {
        // Конвертируйте параметры в нужные типы
        double maxSpeed = Double.parseDouble(carProperties.maxSpeed);
        float acceleration = (float) carProperties.acceleration;
        int score = carProperties.initialScore;
        Integer nitroLevel = getNitroLevel(carProperties.nitroLevel);

        return new Car( // Метод возвращает экземпляр класса Car
                maxSpeed,
                acceleration,
                score,
                nitroLevel
        );
    }

    private static Integer getNitroLevel(int nitroLevel) {
        // Пропишите логику по конвертации параметра nitroLevel
        if (nitroLevel == 0) {
            return null;
        }
        return nitroLevel;
    }
}
