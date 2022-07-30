package javaRushUniversity.javaSyntax.level18.lesson00; // task13.task1309;

import java.util.HashMap;

/*
Успеваемость студентов
*/

/* В классе Solution объявлено поле grades типа HashMap<String, Double>, где ключ — имя и фамилия студента, а значение -
его средняя оценка. Твоя задача — реализовать метод addStudents, который добавит 5 студентов с их средней оценкой в
коллекцию grades. Значения можешь выбрать любые. */

public class Solution01 {
    public static HashMap<String, Double> grades = new HashMap<>();

    public static void main(String[] args) {
        addStudents();
        System.out.println(grades);
    }

    public static void addStudents() {
        //напишите тут ваш код
        grades.put("Student-1", 1.5);
        grades.put("Student-2", 2.5);
        grades.put("Student-3", 3.5);
        grades.put("Student-4", 4.5);
        grades.put("Student-5", 5.5);
    }
}
