package yandex.sprint7.Lambda.task3;

import java.util.function.UnaryOperator;

class Person {
    private String name;
    private String favouriteSpice;

    public Person(String name, String favouriteSpice) {
        this.name = name;
        this.favouriteSpice = favouriteSpice;
    }

    public String getName() {
        return name;
    }

    public String getFavouriteSpice() {
        return favouriteSpice;
    }

    public UnaryOperator<String> addFavouriteSpice() {
        return new Adder(new Person(name, favouriteSpice));
    }
}

class Adder implements UnaryOperator<String> {
    private Person person;

    public Adder(Person person) {
        this.person = person;
    }

    @Override
    public String apply(String recipe) {
        return recipe + " " + person.getFavouriteSpice();
    }
}

public class Practicum {

    public static void main(String[] args) {
        Person petya = new Person("Петя", "паприка");

        String oldRecipe = "тесто томаты курица сыр";
        UnaryOperator<String> petyaAdder = petya.addFavouriteSpice();

        String newRecipe = petyaAdder.apply(oldRecipe);
        System.out.println(newRecipe);
    }
}