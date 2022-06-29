package programaniya.LambdaExpressions.LambdaExpressions2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        Student st1 = new Student("Ivan", 'm', 22, 3, 8.3);
        Student st2 = new Student("Nilolay", 'm', 28, 2, 6.4);
        Student st3 = new Student("Elena", 'f', 19, 1, 8.9);
        Student st4 = new Student("Petr", 'm', 35, 4, 7.0);
        Student st5 = new Student("Mariya", 'f', 23, 3, 9.1);
        ArrayList<Student> students = new ArrayList<>();
        students.add(st1);
        students.add(st2);
        students.add(st3);
        students.add(st4);
        students.add(st5);

        Main info = new Main();
//        Collections.sort(students, new Comparator<Student>() {
//            @Override
//            public int compare(Student s1, Student s2) {
//                return s1.course - s2.course;
//            }
//        });
        Collections.sort(students, (student1, student2) -> student1.course-student2.course);
        System.out.println(students);
    }
}
