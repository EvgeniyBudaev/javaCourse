package alishev.base.classesAndObjects;

public class ClassesAndObjects {
    public static void main(String[] args) {
        Person person1 = new Person();
        person1.setName("Pavel");
        person1.setAge(50);
        person1.speak();

        Person person2 = new Person();
        person2.setName("Ivan");
        person2.setAge(25);
        person2.speak();

        int year1 = person1.calculateYearsToRetirement();
        int year2 = person2.calculateYearsToRetirement();
        System.out.println("The first person before retirement is " + year1 + " years old.");
        System.out.println("The second person before retirement is " + year2 + " years old.");
        System.out.println("The first person name: " + person1.getName());
        System.out.println("The second person name: " + person2.getName());
    }
}

class Person {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setName(String username) {
        if (username.isEmpty()) {
            System.out.println("Name cannot be empty");
        } else {
            name = username;
        }
    }

    public void setAge(int userAge) {
        if (userAge > 100) {
            System.out.println("Age cannot be more than 100");
        } else if (userAge < 0) {
            System.out.println("Age cannot be less than 0");
        } else {
            age = userAge;
        }
    }

    int calculateYearsToRetirement() {
        return 65 - age;
    }

    void speak() {
        System.out.println("My name is " + name + ". I am " + age + " years old.");
    }
}
