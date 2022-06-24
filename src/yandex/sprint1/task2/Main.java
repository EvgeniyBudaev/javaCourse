package yandex.sprint1.task2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Робот-помощник v2.0.");
        // Вызовите ниже методы в правильном порядке
        sayHello();
        sayHelloByTime();
        welcomeUserByName();
        printSuccess();
    }

    public static void welcomeUserByName() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Как вас зовут?");
        String name = scanner.next();
        // Допишите чтение города
        printCity();
        String city = scanner.next();
        System.out.println("Рад познакомиться, " + name + " из " + city + "!");
    }

    public static void printSuccess() {
        System.out.println("У вас уже неплохо получается программировать!");
    }

    // Допишите метод sayHello(), который печатает: Привет!
    public static void sayHello() {
        System.out.println("Привет!");
    }

    // Допишите метод printCity(), который печатает: Из какого вы города?
    public static void printCity() {
        System.out.println("Из какого вы города?");
    }

    public static void sayHelloByTime() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Который час?");
        int currentHour = scanner.nextInt();
        if (currentHour < 6) {
            System.out.println("Доброй ночи!");
        } else if (currentHour > 22) {
            System.out.println("Доброй ночи!");
        } else if (currentHour < 12) {
            System.out.println("Доброе утро!");
        } else if (currentHour < 18) {
            System.out.println("Добрый день!");
        } else {
            System.out.println("Добрый вечер!");
        }
    }
}
