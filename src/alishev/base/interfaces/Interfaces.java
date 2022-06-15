package alishev.base.interfaces;

public class Interfaces {
    public static void main(String[] args) {
        Animal animal = new Animal(1);
        Person person = new Person("Bob");

        Info info1 = new Animal(5);
        Info info2 = new Person("Tom");

        animal.sleep();
        person.sayHello();

        animal.showInfo();
        person.showInfo();

        info1.showInfo();
        info2.showInfo();

        outputInfo(info1);
        outputInfo(info2);

        outputInfo(animal);
        outputInfo(person);
    }

    public static void outputInfo(Info info) {
        info.showInfo();
    }
}
