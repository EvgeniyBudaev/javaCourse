package programaniya.Streams.findFirst;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        /* findFirst - возвращает первыйэлементнашего стрима. Terminal method. */
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

        Student first = students.stream().map(element -> {
            element.setName(element.getName().toUpperCase());
            return element;
        })
                .filter(element -> element.getSex() == 'f')
                .sorted((x, y) ->x.getSex() - y.getAge())
                .findFirst().get();

        System.out.println(first); // Student{name='ELENA', sex=f, age=19, course=1, avgGrade=8.9}
    }
}
