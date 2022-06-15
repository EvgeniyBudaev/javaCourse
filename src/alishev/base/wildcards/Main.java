package alishev.base.wildcards;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Animal> animals = new ArrayList<>();
        animals.add(new Animal(1));
        animals.add(new Animal(2));

        List<Dog> dogs = new ArrayList<>();
        dogs.add(new Dog());
        dogs.add(new Dog());

        test(animals);
        test(dogs);
    }

    private static void test(List<? extends Animal> list) { // List<? super Animal> list
        for (Animal animal: list) {
            System.out.println(animal);
            animal.eat();
        }
    }
}
