package programaniya.generics;

public abstract class Participiant {
    private String name;
    private int age;

    public Participiant(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
