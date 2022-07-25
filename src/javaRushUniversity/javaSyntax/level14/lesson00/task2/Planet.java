package javaRushUniversity.javaSyntax.level14.lesson00.task2;

/*
Земля: техническая характеристика
*/

public class Planet {

    public String name;

    public long age;

    public int speed;

    public int area;

    public void printInformation() {
        System.out.println("Имя планеты: " + name + ".");
        System.out.println("Возраст: " + age + " лет.");
        System.out.println("Орбитальная скорость: " + speed + " км/ч.");
        System.out.println("Общая площадь: " + area + " кв. км.");
    }
}
