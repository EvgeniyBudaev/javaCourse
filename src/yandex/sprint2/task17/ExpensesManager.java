package yandex.sprint2.task17;

import java.util.ArrayList; // Импортируйте ArrayList

public class ExpensesManager {
    ArrayList<Double> expenses; // Замените массив списком

    ExpensesManager() {
        expenses = new ArrayList<>(); // Создайте список в конструкторе
    }

    // Номер дня больше не нужен
    double saveExpense(double moneyBeforeSalary, double expense) {
        expenses.add(expense);
        moneyBeforeSalary = moneyBeforeSalary - expense;
        System.out.println("Значение сохранено! Ваш текущий баланс в рублях: " + moneyBeforeSalary);
        if (moneyBeforeSalary < 1000) {
            System.out.println("На вашем счету осталось совсем немного. Стоит начать экономить!");
        }
        return moneyBeforeSalary;
    }

    void printAllExpenses() {
        for (int i = 0; i < expenses.size(); i++) {
            System.out.println("Трата № " + (i + 1) + ". Потрачено " + expenses.get(i) + " рублей");
        }
    }

    double findMaxExpense() {
        double maxExpense = 0;
        for (Double exp : expenses) { // Используйте сокращённую форму цикла
            if (exp > maxExpense) {
                maxExpense = exp;
            }
        }
        return maxExpense;
    }
}