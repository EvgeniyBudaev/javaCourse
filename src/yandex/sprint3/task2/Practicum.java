package yandex.sprint3.task2;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Practicum {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите сумму в современных рублях:");
        int amount = scanner.nextInt();

        System.out.println("Введите год (1913 или 1984)");
        int year = scanner.nextInt();

        // Посчитайте, сколько у вас рублей для введённого года.
        // Реализуйте конвертацию для каждого случая.
        // Если для указанного года нет курса, то выведите сообщение
        // "Для этого года у нас нет данных." и прекратите выполнение метода.
        // Иначе вызовите метод printPrices.
        double amountOld = 0;
        switch (year) {
            case 1913:
                amountOld = (amount * 1.0) / 884;
                printPrices(year, amountOld);
                break;
            case 1984:
                amountOld = (amount * 1.0) / 337;
                printPrices(year, amountOld);
                break;
            default:
                System.out.println("Для этого года у нас нет данных.");
        }
    }

    public static void printPrices(int year, double amount) {
        System.out.println("В " + year + " году эта сумма приблизительно равнялась бы "
                + String.format("%,.2f", amount) + " р. "
                + "На эти деньги вы могли бы купить следующие товары:");

        HashMap<String, Double> prices = getPrices(year);
        // Найдите все значения, у которых цена меньше переданной суммы.
        // Определите количество товара, которое можно приобрести на переданную сумму.
        // Напечатайте значение в формате «<название> — <количество> шт.».
        findGoods(prices, amount);
    }

    public static void findGoods(HashMap<String, Double> prices, double amount) {
        Map<String, Double> filteredCollect = prices.entrySet().stream()
                .filter(item -> item.getValue() < amount)
                .collect(Collectors.toMap(x -> x.getKey(), x -> x.getValue()));

        for (Map.Entry<String, Double> entry: filteredCollect.entrySet()) {
            System.out.println(entry.getKey() + " - " + ((int) (amount / entry.getValue())) + " шт.");
        }
    }
    public static HashMap<String, Double> getPrices(int year) {
        HashMap<String, Double> prices = new HashMap<>();

        // Добавьте товары в prices в зависимости от значения переменной year.
        switch (year) {
            // Цены 1913 года:
            case 1913:
                prices.put("Корова", 60.0);
                prices.put("Курица", 0.60);
                prices.put("Рубашка", 1.0);
                prices.put("Шапка гусарская", 12.0);
                prices.put("Гармонь", 7.50);
                prices.put("Рояль", 200.0);
                break;
            // Цены 1984 года:
            case 1984:
                prices.put("Банка сгущёнки", 0.55);
                prices.put("Автомобиль «Запорожец»", 5600.0);
                prices.put("Мороженое", 0.20);
                prices.put("Шапка-ушанка цигейковая", 14.0);
                prices.put("Шампанское «Советское»", 3.6);
                prices.put("Карта мира", 2.54);
                prices.put("Мотоцикл «Восход»", 450.0);
                prices.put("Портативный кассетный магнитофон «Весна-202-1»", 195.0);
                prices.put("Пальто осеннее", 100.0);
                break;
            default:
                System.out.println("Для этого года у нас нет данных.");
        }

        return prices;
    }
}