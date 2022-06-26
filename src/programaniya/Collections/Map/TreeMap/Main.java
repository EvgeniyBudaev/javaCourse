package programaniya.Collections.Map.TreeMap;

import org.jetbrains.annotations.NotNull;

import java.util.Objects;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        /* Элементами TreeMap являются пары ключ/значение.
        В TreeMap элементы хранятся в отсортированном по возрастанию порядке. */
        TreeMap<Double, Student> treeMap = new TreeMap<>();
        Student st1 = new Student("Oleg", 1);
        Student st2 = new Student("Nina", 3);
        Student st3 = new Student("Mike", 2);
        treeMap.put(5.8, st1);
        treeMap.put(6.4, st2);
        treeMap.put(3.5, st3);
        System.out.println(treeMap); // {3.5=Student{name='Mike', course=2}, 5.8=Student{name='Oleg', course=1}, 6.4=Student{name='Nina', course=3}}
        System.out.println(treeMap.get(5.8)); // Student{name='Oleg', course=1}
        System.out.println(treeMap.descendingMap()); // {6.4=Student{name='Nina', course=3}, 5.8=Student{name='Oleg', course=1}, 3.5=Student{name='Mike', course=2}}
        System.out.println(treeMap.tailMap(6.0)); // {6.4=Student{name='Nina', course=3}}
        System.out.println(treeMap.headMap(5.0)); // {3.5=Student{name='Mike', course=2}}
        System.out.println(treeMap.lastEntry()); // 6.4=Student{name='Nina', course=3}
        System.out.println(treeMap.firstEntry()); // 3.5=Student{name='Mike', course=2}
        treeMap.remove(5.8);

        TreeMap<Student, Double> treeMap2 = new TreeMap<>();
        treeMap2.put(st1, 5.8);
        treeMap2.put(st2, 6.4);
        treeMap2.put(st3, 3.5);
        System.out.println(treeMap2); // {Student{name='Mike', course=2}=3.5, Student{name='Nina', course=3}=6.4, Student{name='Oleg', course=1}=5.8}
        Student st4 = new Student("Mike", 2);
        System.out.println(treeMap2.containsKey(st4)); // true
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
        return course == student.course && Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, course);
    }

    @Override
    public int compareTo(@NotNull Student o) {
        return this.name.compareTo(o.name);
    }
}
