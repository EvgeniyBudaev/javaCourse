package programaniya.Collections.Queue.PriorityQueue;

import org.jetbrains.annotations.NotNull;

import java.util.Objects;
import java.util.PriorityQueue;

public class Main {
    public static void main(String[] args) {
        /* PriorityQueue - это специальный вид очереди, в котором используется натуральная сортировка и
        * которую мы описываем с помощью Comparable или Comparator. Таким образом используется тот элемент из очереди,
        * приоритет которого выше. */
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
        priorityQueue.add(4);
        priorityQueue.add(1);
        priorityQueue.add(10);
        priorityQueue.add(8);
        priorityQueue.add(5);
        System.out.println(priorityQueue); // [1, 4, 10, 8, 5]
        System.out.println(priorityQueue.peek()); // 1

        System.out.println(priorityQueue.remove()); // 1
        System.out.println(priorityQueue.remove()); // 4
        System.out.println(priorityQueue.remove()); // 5
        System.out.println(priorityQueue.remove()); // 8
        System.out.println(priorityQueue.remove()); // 10

        Student st1 = new Student("Bob", 5);
        Student st2 = new Student("Mike", 1);
        Student st3 = new Student("Elena", 3);
        PriorityQueue<Student> students = new PriorityQueue<>();
        students.add(st1);
        students.add(st2);
        students.add(st3);
        System.out.println(students); // [Student{name='Mike', course=1}, Student{name='Bob', course=5}, Student{name='Elena', course=3}]
        System.out.println(students.poll()); // Student{name='Mike', course=1}
        System.out.println(students.poll()); // Student{name='Elena', course=3}
        System.out.println(students.poll()); // Student{name='Bob', course=5}
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

    @Override
    public int compareTo(@NotNull Student other) {
        return this.course- other.course;
    }
}
