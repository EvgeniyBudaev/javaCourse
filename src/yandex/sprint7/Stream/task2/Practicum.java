package yandex.sprint7.Stream.task2;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Stream;

class Flat {
    private String city;
    private int price;
    private int area;

    public Flat(String city, int price, int area) {
        this.city = city;
        this.price = price;
        this.area = area;
    }

    public String getCity() {
        return city;
    }

    public int getPrice() {
        return price;
    }

    public int getArea() {
        return area;
    }

    @Override
    public String toString() {
        return "Flat{" +
                "city='" + city + '\'' +
                ", price=" + price + "$" +
                ", area=" + area + " кв.м." +
                '}';
    }
}

public class Practicum {

    public static void main(String[] args) {
        List<Flat> all = List.of(
                new Flat("Амстердам", 150_000, 50),
                new Flat("Санкт-Петербург", 350_000, 130),
                new Flat("Амстердам", 900_000, 150),
                new Flat("Рим", 60_000, 200),
                new Flat("Лондон", 3000, 30)
        );

        // Код писать сюда
        Stream<Flat> filteredStream = all.stream()
                .filter(flat -> flat.getPrice() < 100_000 && flat.getArea() > 100);
        filteredStream.forEach(System.out::println);
    }
}
