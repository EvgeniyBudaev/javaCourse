package programaniya.LambdaExpressions.Predicate;

import java.util.ArrayList;
import java.util.function.Predicate;

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
        StudentInfo info = new StudentInfo();

        info.testStudents(students, p -> p.avgGrade > 8);
        System.out.println("--------------------------");

        Predicate<Student> p1 = student -> student.avgGrade > 8;
        Predicate<Student> p2 = student -> student.sex == 'm';
        info.testStudents(students, p1.and(p2));
        info.testStudents(students, p1.or(p2));
        info.testStudents(students, p1.negate()); // negate - отрицание


    }
}

class StudentInfo {
    void testStudents(ArrayList<Student> al, Predicate<Student> pr) {
        for (Student s: al) {
            if (pr.test(s)) {
                System.out.println(s);
            }
        }
    }
}
