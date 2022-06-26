package programaniya.Collections.Map.HashTable;

import java.util.Hashtable;
import java.util.Objects;

public class Main {
    public static void main(String[] args) {
        /* HashTable устаревший класс, который работает по тем же принципам, что и HashMap.
        * В отличии от HashMap является synchronized.
        * По этой причине его методы далеко не такие быстрые.
        * В HashTable ни ключ, ни знфчение не может быть null.
        * Даже если нужна поддержка многопоточности HashTable лучше не использовать.
        * Следует использовать ConcurrentHashMap. */
        Hashtable<Double, Student> ht = new Hashtable<>();
        Student st1 = new Student("Zaur", 1);
        Student st2 = new Student("Bob", 3);
        Student st3 = new Student("Mike", 2);
        ht.put(7.8, st1);
        ht.put(5.5, st2);
        ht.put(10.0, st3);
        System.out.println(ht); // {10.0=Student{name='Mike', course=2}, 7.8=Student{name='Zaur', course=1}, 5.5=Student{name='Bob', course=3}}

    }
}

class Student {
    String name;
    int course;

    public Student(String name, int course) {
        this.name = name;
        this.course = course;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return course == student.course && Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, course);
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", course=" + course +
                '}';
    }
}
