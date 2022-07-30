package javaRushUniversity.javaSyntax.level18.lesson00; // task13.task1311;

import java.util.HashMap;
import java.util.Map;

/*
Успеваемость студентов-3
*/

/* В классе Solution объявлено поле grades типа HashMap<String, Double>, где ключ — имя и фамилия студента, а значение -
его средняя оценка. Попробуем сделать один метод, который будет выводить полную информацию о студентах, используя метод
entrySet класса HashMap. */

public class Solution03 {
    public static HashMap<String, Double> grades = new HashMap<>();

    public static void main(String[] args) {
        addStudents();
        printStudentsInfo();
    }

    public static void addStudents() {
        grades.put("Кесарчук Олег", 4.3d);
        grades.put("Шульга Николай", 4.1d);
        grades.put("Колос Василий", 4.9d);
        grades.put("Шевченко Тарас", 3.7d);
        grades.put("Марчук Любослав", 3.2d);
    }

    public static void printStudentsInfo() {
        //напишите тут ваш код
//        for (Map.Entry<String, Double> item: grades.entrySet()) {
//            System.out.println(item.getKey() + " : " + item.getValue());
//        }
        for (var item: grades.entrySet()) {
            System.out.println(item.getKey() + " : " + item.getValue());
        }
    }
}