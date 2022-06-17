package alishev.advanced.collections.hashcodeEquals;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Map<Person, String> map = new HashMap<>();
        Set<Person> set = new HashSet<>();

        Person person1 = new Person(1, "Mike");
        Person person2 = new Person(1, "Mike");

        map.put(person1, "111");
        map.put(person2, "111");

        set.add(person1);
        set.add(person2);

        System.out.println(map); // {Person{id=1, name='Mike'}=111}
        System.out.println(set); // [Person{id=1, name='Mike'}]
    }
}

class Person {
    private int id;
    private String name;

    public Person(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return id == person.id && name.equals(person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }

    /*
        Контракт hashcode() equals()
        1) У двух проверяемых объектов вызываем метод hashcode()
           если хеши разные -> два объекта точно разные.
        2) Есои хеши одинаковые вызываем етод equals()
        3) equals() -> выдает ответ
     */
}
