package programaniya.Collections.Set.TreeSet;

import org.jetbrains.annotations.NotNull;

import java.util.Objects;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        /* TreeSet хранит элементы в отсортированном по возрастанию порядке.
        * В основе TreeSet лежит TreeMap. У элементов данного TreeMap: ключи - это элементы TreeSet,
        * значения - это константа-заглушка. */
        Set<Integer> treeSet = new TreeSet<>();
        treeSet.add(5);
        treeSet.add(8);
        treeSet.add(1);
        treeSet.add(10);
        System.out.println(treeSet); // [1, 5, 8, 10]
        System.out.println(treeSet.contains(1)); // true

        treeSet.remove(2);
        System.out.println(treeSet); // [1, 5, 8, 10]

        TreeSet<Student> students = new TreeSet<>();
        Student st1 = new Student("Bob", 1);
        Student st2 = new Student("Mike", 3);
        Student st3 = new Student("Alina", 2);
        students.add(st1);
        students.add(st2);
        students.add(st3);
        System.out.println(students); // [Student{name='Bob', course=1}, Student{name='Alina', course=2}, Student{name='Mike', course=3}]

        System.out.println(students.first()); // Student{name='Bob', course=1}
        System.out.println(students.last()); // Student{name='Mike', course=3}
        Student st4 = new Student("Oleg", 2);
        System.out.println(students.headSet(st4)); // [Student{name='Bob', course=1}]
        System.out.println(students.tailSet(st4)); // [Student{name='Alina', course=2}, Student{name='Mike', course=3}]
        Student st5 = new Student("Ivan", 4);
        System.out.println(students.subSet(st4, st5)); // [Student{name='Alina', course=2}, Student{name='Mike', course=3}]
        System.out.println(st3.equals(st4)); // true
    }
}

class Student implements Comparable<Student> {
    String name;
    int course;

    public Student(String name, int course) {
        this.name = name;
        this.course = course;
    }

    @Override
    public int compareTo(@NotNull Student other) {
        return this.course- other.course;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", course=" + course +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return course == student.course;
    }

    @Override
    public int hashCode() {
        return Objects.hash(course);
    }
}
