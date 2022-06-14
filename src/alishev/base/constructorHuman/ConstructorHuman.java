package alishev.base.constructorHuman;

public class ConstructorHuman {
    public static void main(String[] args) {
        Human human1 = new Human("Evgeniy", 50);
    }
}

class Human {
    private String name;
    private int age;

    public Human() {
        System.out.println("Constructor is default");
        this.name = "Name is default";
        this.age = 0;
    }

    public Human(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
