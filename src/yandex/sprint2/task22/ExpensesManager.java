package yandex.sprint2.task22;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class ExpensesManager {
    HashMap<String, ArrayList<Double>> expensesByCategories; // Замените на таблицу с именем expensesByCategories

    ExpensesManager() {
        expensesByCategories = new HashMap<>(); // Создайте таблицу
    }

    // Добавьте в метод ещё один параметр — category
    double saveExpense(double moneyBeforeSalary, double expense, String category) {
        moneyBeforeSalary = moneyBeforeSalary - expense;
        System.out.println("Значение сохранено! Ваш текущий баланс в рублях: " + moneyBeforeSalary);
        // Замените на работу с таблицей
        if (expensesByCategories.containsKey(category)) { // Проверьте наличие категории
            ArrayList<Double> expenses = expensesByCategories.get(category); // Получите список трат в этой категории
            expenses.add(expense); // Добавьте трату
        } else {
            ArrayList<Double> newExpenses = new ArrayList<>(); // Создайте новый список трат и добавьте в него сумму
            newExpenses.add(expense);
            expensesByCategories.put(category, newExpenses); // Сохраните категорию и новый список трат в хеш-таблицу
        }
        if (moneyBeforeSalary < 1000) {
            System.out.println("На вашем счету осталось совсем немного. Стоит начать экономить!");
        }
        return moneyBeforeSalary;
    }


    void printAllExpensesByCategories() {
        // Замените логику для работы с таблицами
        for (String category : expensesByCategories.keySet()) {
            ArrayList<Double> expenses = expensesByCategories.get(category);
            System.out.println(category);
            for (int i = 0; i < expenses.size(); i++) {
                System.out.println(expenses.get(i));
            }
        }
    }

    // Метод должен принимать название категории и называться findMaxExpenseInCategory
    double findMaxExpenseInCategory(String category) {
        double maxExpense = 0;
        /* Замените логику для работы с таблицами
        Если категория есть, то ищем максмальную трату.
        Иначе печатаем "Такой категории пока нет." */
        if (expensesByCategories.containsKey(category)) {
            for (ArrayList<Double> exp : expensesByCategories.values()) {
                if (Collections.max(exp) > maxExpense) {
                    maxExpense = Collections.max(exp);
                }
            }
        } else {
            System.out.println("Такой категории пока нет.");
        }
        return maxExpense;
    }

    void removeAllExpenses() {
        expensesByCategories.clear(); // Таблица называется иначе
        System.out.println("Траты удалены.");
    }
}
