package yandex.sprint4.task11;

public class Practicum {

    public static void main(String[] args) {
        Pair pair = new Pair("4", "1");
        System.out.println("Координаты игрока на карте:");
        pair.print();
        Integer x = Integer.parseInt(pair.getKey());
        Integer y = Integer.parseInt(pair.getValue());

        System.out.println();

        Pair stringPair = new Pair("username", "1");
        System.out.println("Чит-код пользователя:");
        stringPair.print();
        String user = stringPair.getKey();
        String cheatCode = stringPair.getValue();
    }

}
class Pair {
    public final String key;
    public final String value;

    public Pair(String key, String value) {
        this.key = key;
        this.value = value;
    }

    public void print() {
        System.out.printf("(%s, %s)", key, value);
    }

    public String getKey() {
        return key;
    }

    public String getValue() {
        return value;
    }
}