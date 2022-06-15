package alishev.base.polimorphism;

public class Main {
    public static void main(String[] args) {
        Animal animal1 = new Animal();
        Animal animal2 = new Dog(); // upcasting - восходящее преобразование
        animal2.eat(); // Dog is eating

        Dog dog = new Dog();
        dog.eat(); // Dog is eating
        dog.bark(); // Dog is barking
        Animal animal3 = dog; // Наша собака стала животным
        animal3.eat();

        Cat cat = new Cat();

        test(animal1); // Animal is eating
        test(dog); // Dog is eating
        test(cat); // Animal is eating

        // Downcasting - нисходящее преобразование от родителя к потомкам (делаем из животного собаку)
        Dog dog2 = (Dog) animal2;
        dog2.bark();
        Dog dog3 = (Dog) animal3;
        dog3.bark();
    }

    public static void test(Animal animal) {
        animal.eat();
    }
}
