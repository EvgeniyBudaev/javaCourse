package yandex.sprint1.task4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Привет!");

        doCommand();
    }

    public static void doCommand() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Что вы хотите сделать?");
            System.out.println("1 - Получить совет о покупке евро");
            System.out.println("2 - Получить совет о покупке долларов");
            System.out.println("0 - Выход");
            int command = scanner.nextInt();
            if (command == 1) {
                System.out.println("Если евро стоит меньше 90 рублей - покупайте!");
            } else if (command == 2) {
                System.out.println("Если доллар стоит меньше 75 рублей - покупайте!");
            } else if (command == 0) {
                System.out.println("Выход");
                break;
            }
        }
    }
}
