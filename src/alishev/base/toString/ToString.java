package alishev.base.toString;

public class ToString {
    public static void main(String[] args) {
        Human h1 = new Human("Bob");
        // Если не переопределили метод toString()
        System.out.println(h1); // alishev.base.toString.Human@7b23ec81
        System.out.println(h1.toString()); // alishev.base.toString.Human@7b23ec81
        // После переопределения toString()
        System.out.println(h1); // Bob
        System.out.println(h1.toString()); // Bob
    }
}

class Human {
    private String name;

    public Human(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}
