package yandex.sprint2.task12;

import java.util.Scanner;

public class Praktikum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Какой год вы хотите проверить?");
        int year = scanner.nextInt();

        boolean isLeapYear = year % 400 == 0 || year % 4 == 0 && year % 100 != 0; // Составьте логическое выражение
        // Напишите ветвление, где isLeapYear станет условием
        // Используйте фразы для печати:
        // System.out.println("Согласно григорианскому календарю, этот год - не високосный!");
        // System.out.println("Согласно григорианскому календарю, этот год - високосный!");
        if (isLeapYear) {
            System.out.println("Согласно григорианскому календарю, этот год - високосный!");
        } else {
            System.out.println("Согласно григорианскому календарю, этот год - не високосный!");
        }
    }
}
