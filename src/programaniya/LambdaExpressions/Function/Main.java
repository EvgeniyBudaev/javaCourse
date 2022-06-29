package programaniya.LambdaExpressions.Function;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class Main {
    public static void main(String[] args) {
        /* Function<T, R> */
        /*Метод R apple(T t); */
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

        // Function<Student, Double> f = student -> student.avgGrade;
        double avgGrade = avgOfSmth(students, stud -> stud.avgGrade);
        System.out.println(avgGrade);
        double avgCourse = avgOfSmth(students, stud -> (double)stud.course);
        System.out.println(avgCourse);
    }

    private static double avgOfSmth(List<Student> list, Function<Student,Double> f) {
        double result = 0;
        for (Student st: list) {
            result += f.apply(st);
        }
        result = result / list.size();
        return result;
    }
}
