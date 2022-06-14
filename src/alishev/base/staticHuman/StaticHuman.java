package alishev.base.staticHuman;

public class StaticHuman {
    public static void main(String[] args) {
        Human human1 = new Human("Evgeniy", 50);
        Human human2 = new Human("Bob", 30);
        Human.description = "Nice";
        Human.getDescription();
        human1.getAllFields();
        Human.getCountEmployees();
    }
}

class Human {
    private String name;
    private int age;
    public static String description;
    public static int countEmployees;

    public Human() {
        System.out.println("Constructor is default");
        this.name = "Name is default";
        this.age = 0;
    }

    public Human(String name, int age) {
        this.name = name;
        this.age = age;
        countEmployees++;
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

    public static void getDescription() {
        System.out.println(description);
    }

    public void getAllFields() {
        System.out.println(name + ", " + age + ", " + description);
    }

    public static void getCountEmployees() {
        System.out.println(countEmployees);
    }
}
