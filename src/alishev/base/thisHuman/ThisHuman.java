package alishev.base.thisHuman;

public class ThisHuman {
    public static void main(String[] args) {
        Human human1 = new Human();
        human1.setName("Ivan");
        human1.setAge(50);
        human1.getInfo();
    }
}

class Human {
    String name;
    int age;

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

    public void getInfo() {
        System.out.println(name + ", " + age);
    }
}
