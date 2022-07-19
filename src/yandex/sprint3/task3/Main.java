package yandex.sprint3.task3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите имя работника:");
        WorkCalculator calculator = new WorkCalculator(scanner.next());

        System.out.println("Введите коэффициент в формате 1,5:");
        calculator.coefficient = scanner.nextDouble();

        System.out.println("Введите количество отработанных дней без коэффициента:");
        double hoursWithoutCoefficient = calculator.calculate(scanner.nextInt());

        System.out.println("Введите количество отработанных дней с коэффициентом:");
        double hoursWithCoefficient = calculator.calculateWithCoefficient(scanner.nextInt());

        double allWorkHours = hoursWithoutCoefficient + hoursWithCoefficient;
        // метод printf позволяет нам вывести строку с форматированием
        // символ %s заменит строку, а %.2f число с 2 знаками после запятой
        System.out.printf("Работник %s отработал %.2f часов.",
                calculator.getWorkerName(), allWorkHours);
    }
}