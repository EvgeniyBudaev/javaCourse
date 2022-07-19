package yandex.sprint3.task10;

class Coffee {
    String coffeeName = "Капучино";
    String clientName;
    boolean isCinnamon;

    public Coffee(String newCoffeeName, String newClientName, boolean isNewCinnamon) {
        isCinnamon = isNewCinnamon;
        coffeeName = newCoffeeName;
        clientName = newClientName;
    }
}

public class Practicum {
    public static void main(String[] args) {
        String сlientName = "Маша";
        Coffee coffee = new Coffee("Капучино", сlientName, true);
    }
}