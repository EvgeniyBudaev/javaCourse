package alishev.base.equalsStringPool;

public class Main {
    public static void main(String[] args) {
        int x = 1;
        int y = 1;
        System.out.println("x == y: " + (x == y)); // true

        String str1 = "Hello";
        String str2 = "Hello";
        System.out.println("str1 == str2: " + (str1 == str2)); // true, т.к. String pool
        System.out.println("str1.equals(str2): " + (str1.equals(str2))); // true

        String str3 = new String("Hello");
        String str4 = new String("Hello");
        System.out.println("str3.equals(str4): " + (str3.equals(str4))); // true

        Animal animal1 = new Animal(1);
        Animal animal2 = new Animal(1);
        System.out.println("animal1 == animal2: " + (animal1 == animal2)); // false

        System.out.println("animal1.equals(animal2): " + (animal1.equals(animal2))); // true
    }
}

class Animal {
    int id;

    public Animal(int id) {
        this.id = id;
    }

    public boolean equals(Object obj) {
        Animal otherAnimal = (Animal) obj;
        return this.id == otherAnimal.id;
    }
}
