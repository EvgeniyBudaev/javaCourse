package alishev.base.nasledovanie;

public class Dog extends Animal {
    public void eat() {
        System.out.println("Dog is eating");
    }

    public void bark() {
        System.out.println("Gav gav");
    }

    public void showName() {
        System.out.println(name);
    }
}
