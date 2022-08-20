package javaRushUniversity.javaSyntax.level22.lesson00.task2;

import java.util.ArrayList;

public class Human {
    private String name;
    private int age;
    private ArrayList<Human> children;

    public Human(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Human(String name, int age, ArrayList<Human> children) {
        this(name, age);
        this.children = children;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public ArrayList<Human> getChildren() {
        return children;
    }
}