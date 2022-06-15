package alishev.base.abstractClass;

public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat();
        Dog dog = new Dog();
        Duck duck = new Duck();

        cat.makeSound();
        dog.makeSound();
        duck.makeSound();

        cat.eat();
        dog.eat();
    }
}
