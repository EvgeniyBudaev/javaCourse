package programaniya.Collections.Map.LinkedHashMap;

import java.util.LinkedHashMap;
import java.util.Objects;

public class Main {
    public static void main(String[] args) {
        /* LinkedHashMap является наследником HashMap.
        * Хранит информацию о порядке добавления элементов или порядке их использования.
        * Производительность методов ниже, чем у методов HashMap. */
        LinkedHashMap<Double, Student> lhm = new LinkedHashMap<>(16, 0.75f, false);
        Student st1 = new Student("Zaur", 1);
        Student st2 = new Student("Bob", 3);
        Student st3 = new Student("Mike", 2);
        lhm.put(5.5, st1);
        lhm.put(7.2, st2);
        lhm.put(4.5, st3);
        System.out.println(lhm); // {5.5=Student{name='Zaur', course=1}, 7.2=Student{name='Bob', course=3}, 4.5=Student{name='Mike', course=2}}

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
