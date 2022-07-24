package javaRushUniversity.javaSyntax.level13.lesson04.task2; // task10.task1010;

import java.util.Objects;

/*
Два айфона
*/

public class Iphone {
    private String model;
    private String color;
    private int price;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Iphone iphone = (Iphone) o;
        return price == iphone.price && Objects.equals(model, iphone.model) && Objects.equals(color, iphone.color);
    }

    public Iphone(String model, String color, int price) {
        this.model = model;
        this.color = color;
        this.price = price;
    }

    //напишите тут ваш код

    public static void main(String[] args) {
        Iphone iphone1 = new Iphone("X", "Black", 999);
        Iphone iphone2 = new Iphone("X", "Black", 999);

        System.out.println(iphone1.equals(iphone2));
    }
}
