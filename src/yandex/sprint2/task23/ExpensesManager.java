package yandex.sprint2.task23;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class ExpensesManager {
    HashMap<String, ArrayList<Double>> expensesByCategories;

    ExpensesManager() {
        expensesByCategories = new HashMap<>();
    }

    double saveExpense(double moneyBeforeSalary, String category, double expense) {
        moneyBeforeSalary = moneyBeforeSalary - expense;
        System.out.println("Значение сохранено! Ваш текущий баланс в рублях: " + moneyBeforeSalary);
        if (expensesByCategories.containsKey(category)) {
            ArrayList<Double> expenses = expensesByCategories.get(category);
            expenses.add(expense);
        } else {
            ArrayList<Double> expenses = new ArrayList<>();
            expenses.add(expense);
            expensesByCategories.put(category, expenses);
        }
        if (moneyBeforeSalary < 1000) {
            System.out.println("На вашем счету осталось совсем немного. Стоит начать экономить!");
        }
        return moneyBeforeSalary;
    }

    void printAllExpensesByCategories() {
        for (String category : expensesByCategories.keySet()) {
            System.out.println(category);
            ArrayList<Double> expenses = expensesByCategories.get(category);
            for (Double expense : expenses) {
                System.out.println(expense);
            }
        }
    }

    double findMaxExpenseInCategory(String category) {
        double maxExpense = 0;
        if (expensesByCategories.containsKey(category)) {
            ArrayList<Double> expenses = expensesByCategories.get(category);
            for (Double expense : expenses) {
                if (expense > maxExpense) {
                    maxExpense = expense;
                }
            }
        } else {
            System.out.println("Такой категории пока нет.");
        }
        return maxExpense;
    }

    void removeAllExpenses() {
        expensesByCategories.clear();
        System.out.println("Траты удалены.");
    }

    // Напишите метод для получения суммы всех трат
    double getExpensesSum() {
        double result = 0.0;
        for (ArrayList<Double> expenses: expensesByCategories.values()) {
            result += expenses.stream().reduce(0.0, Double::sum);
        }
        return result;
    }


    // Напишите метод для удаления категории
    void removeCategory(String name) {
        expensesByCategories.remove(name);
    }

    // Напишите метод для получения категории, где размер трат больше всего
    String getMaxCategoryName() {
        // Используйте эти переменные для сохранения промежуточных значений
        double categoryExpense = 0;
        String maxCategoryName = "";

        for (Map.Entry<String, ArrayList<Double>> expenses : expensesByCategories.entrySet()) {
            double sum = expenses.getValue().stream().reduce(0.0, Double::sum);
            if (sum > categoryExpense) {
                categoryExpense = sum;
                maxCategoryName = expenses.getKey();
            }
        }
        
        return maxCategoryName;
    }
}
