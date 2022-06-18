package alishev.advanced.collections.queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

public class Main {
    public static void main(String[] args) {
        Person person1 = new Person(1);
        Person person2 = new Person(2);
        Person person3 = new Person(3);
        Person person4 = new Person(4);

        Queue<Person> people = new LinkedList<>();
        people.add(person3);
        people.add(person2);
        people.add(person4);
        people.add(person1);

        for (Person person: people) {
            System.out.println(person);
        }
        System.out.println("--------");
        System.out.println(people.peek()); // Person{id=3} peek - посмотреть на элемент не удаляя его из очереди
        System.out.println(people.remove()); // Person{id=3} remove - удаляет и возвращает элемент
        System.out.println("--------");

        Queue<Person> humans = new ArrayBlockingQueue<Person>(10);
        humans.add(person3);
        humans.add(person2);
        humans.add(person4);
        humans.add(person1);

        for (Person person: humans) {
            System.out.println(person);
        }
        System.out.println("--------");
    }
}

class Person {
    private int id;

    public Person(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                '}';
    }
}
