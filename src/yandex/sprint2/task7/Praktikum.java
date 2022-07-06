package yandex.sprint2.task7;

public class Praktikum {
    public static void main(String[] args) {
        double roubles = 5000; // сумма на счету
        double yearRate = 4; // годовая процентная ставка
        int numOfMonth = 36; // количество месяцев, на который открыт вклад
        double monthRefill = 1000; // ежемесячное пополнение

        double monthRate = yearRate / 12; // вычислите месячную процентную ставку

        for (int i = 0; i < numOfMonth; i++) { // дополните условие цикла
            double depositInterest = roubles * monthRate / 100; // вычислите доход от процентов
            roubles += depositInterest; // добавьте доход от процентов
            roubles += monthRefill; // учтите ежемесячное пополнение
        }

        System.out.println("Через " + numOfMonth + " месяцев накопится " + roubles + " рублей");

        if (roubles >= 41_000) { // определите, удалось ли достичь цели
            System.out.println("Ура! Можно идти в магазин за новым объективом!");
        } else {
            System.out.println("Нужно ещё немного подкопить.");
        }
    }
}
