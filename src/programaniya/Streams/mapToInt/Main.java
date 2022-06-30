package programaniya.Streams.mapToInt;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        /* mapToInt - возвращает Stream, который содержит значение int */
        Student st1 = new Student("Ivan", 'm',22, 3, 8.3);
        Student st2 = new Student("Nikolay", 'm',28, 2, 6.4);
        Student st3 = new Student("Elena", 'f',19, 1, 8.9);
        Student st4 = new Student("Petr", 'm',35, 4, 7);
        Student st5 = new Student("Mariya", 'f',23, 3, 7.4);
        List<Student> students = new ArrayList<>();
        students.add(st1);
        students.add(st2);
        students.add(st3);
        students.add(st4);
        students.add(st5);

        List<Integer> courses = students.stream()
                .mapToInt(el -> el.getCourse())
                .boxed() // boxed конвектирует значение int в Integer
                .collect(Collectors.toList());
        System.out.println(courses); // [3, 2, 1, 4, 3]

        List<Double> grade = students.stream()
                .mapToDouble(el -> el.getAvgGrade())
                .boxed() // boxed конвектирует значение double в Double
                .collect(Collectors.toList());
        System.out.println(grade); // [8.3, 6.4, 8.9, 7.0, 7.4]

        int sum = students.stream().mapToInt(el -> el.getCourse()).sum();
        System.out.println(sum); // 13

        double average = students.stream().mapToInt(el -> el.getCourse())
                .average().getAsDouble();
        System.out.println(average); // 2.6

        int min = students.stream().mapToInt(el -> el.getCourse()).min().getAsInt();
        System.out.println(min); // 1

        int max = students.stream().mapToInt(el -> el.getCourse()).max().getAsInt();
        System.out.println(max); // 4
    }
}
