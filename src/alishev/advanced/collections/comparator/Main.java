package alishev.advanced.collections.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> animals = new ArrayList<>();
        animals.add("asdsd");
        animals.add("cat");
        animals.add("dog");
        animals.add("a");
        animals.add("frog");
        animals.add("ab");
        animals.add("bird");

        // Сортировка по лексиграфическому значению
        Collections.sort(animals);
        System.out.println(animals); // [a, ab, asdsd, bird, cat, dog, frog]
        Collections.sort(animals, new StringLengthComparator());
        System.out.println(animals); // [a, ab, cat, dog, bird, frog, asdsd] по длине строк сортирует

        List<Integer> numbers = new ArrayList<>();
        numbers.add(5);
        numbers.add(0);
        numbers.add(100);

        Collections.sort(numbers);
        System.out.println(numbers); // [0, 5, 100]
        Collections.sort(numbers, new BackwardsIntegerComparator());
        System.out.println(numbers); // [0, 5, 100]
        // Чтобы не создавать класс
//        Collections.sort(numbers, new Comparator<Integer>() {
//            @Override
//            public int compare(Integer o1, Integer o2) {
//                return 0;
//            }
//        });

        List<Person> people = new ArrayList<>();
        people.add(new Person(3, "Bob"));
        people.add(new Person(1, "Tom"));
        people.add(new Person(2, "Mike"));

        Collections.sort(people, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                if (o1.getId() > o2.getId()) {
                    return 1;
                } else if (o1.getId() < o2.getId()) {
                    return -1;
                } else {
                    return 0;
                }
            }
        });

        System.out.println(people);
    }
}

class StringLengthComparator implements Comparator<String> {
    @Override
    public int compare(String o1, String o2) {
        if (o1.length() > o2.length()) {
            return 1;
        } else if (o1.length() < o2.length()) {
            return -1;
        } else {
            return 0;
        }
    }
}

class BackwardsIntegerComparator implements Comparator<Integer> {
    @Override
    public int compare(Integer o1, Integer o2) {
        if (o1 > o2) {
            return 1;
        } else if (o1 < o2) {
            return -1;
        } else {
            return 0;
        }
    }
}

class Person {
    private int id;
    private String name;

    public Person(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
