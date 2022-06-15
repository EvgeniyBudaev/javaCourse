package alishev.base.nasledovanie;

public class Nasledovanie {
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.eat();
        animal.sleep();
        Dog dog = new Dog();
        dog.eat();
        dog.sleep();
        dog.bark();
        dog.showName();
    }
}
