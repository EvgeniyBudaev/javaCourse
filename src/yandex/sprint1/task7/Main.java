package yandex.sprint1.task7;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Какую зарплату вы получите в этом месяце?");
        int salary = scanner.nextInt();
        System.out.println("Сколько планируете потратить на транспорт?");
        int transportMoney = scanner.nextInt();
        System.out.println("Сколько запланировано на супермаркеты?");
        int foodMoney = scanner.nextInt();
        System.out.println("Какую сумму хотите отложить?");
        int savings = scanner.nextInt();

        correctExpenses(salary, transportMoney, foodMoney, savings); // Вызовите метод correctExpenses с правильными аргументами

        // Напечатайте запланированные траты
        System.out.println("Вы планировали потратить: транспорт — " + transportMoney + ", "
                + "еда — " + foodMoney + ", "
                + "сбережения — " + savings + ".");
    }

    // Объявите метод correctExpenses
    // Тело метода дано ниже
    public static void correctExpenses(int salary, int transportMoney, int foodMoney, int savings) {
        int expensesSum = transportMoney + foodMoney + savings; // Считаем расходы
        int leftMoney = salary - expensesSum; // Считаем излишек средств

        if (expensesSum > salary) { // Проверяем, не превышают ли расходы зарплату
            int lackMoney = expensesSum - salary; // Считаем, сколько не хватает

            // Пока не начнёт хватать денег на транспорт — сокращаем траты на 100 рублей
            while ((salary - foodMoney) < transportMoney) {
                foodMoney = foodMoney - 100;
            }
            // Если не хватает денег на жизнь — не откладываем
            if (transportMoney + foodMoney + savings > salary) {
                savings = 0;
            }

            // Печатаем рекомендации
            System.out.println("Придётся пересмотреть планы, вам не хватает " + lackMoney);
            System.out.println("Рекомендуемые траты: "
                    + "еда — " + foodMoney + ", "
                    + "сбережения — " + savings + ".");
        } else {
            System.out.println("В этом месяце дебет с кредитом сошлись!");
            System.out.println("Свободных средств " + leftMoney);
        }
    }
}
