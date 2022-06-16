package alishev.base.enums;

public class Main {
    public static void main(String[] args) {
        Animal animal = Animal.CAT;
        System.out.println(animal); // Перевод на русский язык: кошка
        System.out.println(animal.getTranslation()); // кошка
        System.out.println(animal.name()); // CAT
        System.out.println(animal.ordinal()); // 1

        switch (animal) {
            case CAT -> System.out.println("I's a cat");
            default -> System.out.println("Warning");
        }
    }
}
