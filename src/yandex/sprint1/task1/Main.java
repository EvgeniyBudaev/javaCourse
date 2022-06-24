package yandex.sprint1.task1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Робот-помощник v1.0.");
        welcomeUserByName();
        sayHelloByTime();
        printSuccess();
    }

    public static void welcomeUserByName() {
        // Объявите ниже метод welcomeUserByName
        Scanner scanner = new Scanner(System.in);
        System.out.println("Как вас зовут?");
        // Сохраните введённое пользователем имя в переменную name
        String name = scanner.nextLine();
        System.out.println("Рад познакомиться, " + name + "!");
    }

    // Объявите метод sayHelloByTime
    // Спросите у пользователя "Который час?" и сохраните ответ в переменную currentHour
    // В зависимости от времени предусмотрите печать приветствий
    public static void sayHelloByTime() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Который час?");
        int currentHour = scanner.nextInt();
        if (currentHour >= 6 && currentHour < 12) {
            System.out.println("Доброе утро!");
        } else if (currentHour >= 12 && currentHour < 18) {
            System.out.println("Добрый день!");
        } else if (currentHour >= 18 && currentHour < 22) {
            System.out.println("Добрый вечер!");
        } else {
            System.out.println("Доброй ночи!");
        }
    }


    // Объявите метод printSuccess
    // Он должен печатать строку: У вас уже неплохо получается программировать!
    public static void  printSuccess() {
        System.out.println("У вас уже неплохо получается программировать!");
    }
}
