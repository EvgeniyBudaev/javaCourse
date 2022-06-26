package programaniya.Collections.LinkedList;

import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        Student st1 = new Student("Elena", 1);
        Student st2 = new Student("Olga", 3);
        Student st3 = new Student("Andrey", 2);
        LinkedList<Student> list = new LinkedList<>();
        list.add(st1);
        list.add(st2);
        list.add(st3);
        // [Student{name='Elena', course=1}, Student{name='Olga', course=3}, Student{name='Andrey', course=2}]
        System.out.println(list);
        System.out.println(list.get(0)); // Student{name='Elena', course=1}
        list.remove(2);
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
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", course=" + course +
                '}';
    }
}
