package javaRushUniversity.javaSyntax.level21.lesson01.task2; // task14.task1403;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/*
Помощник преподавателя-2
*/

/*  если введено не целое число, метод parseInt бросает NumberFormatException. Оберни часть кода в try-catch так, чтобы
программа продолжала работу, даже если было введено не целое число. И если введено не целое число, выведи в консоль
сообщение: "Нужно ввести целое число" и выполни continue; для корректной работы цикла.  */

public class Solution {

    public static final String PROMPT_STRING = "Введите номер студента, или exit для выхода: ";
    public static final String EXIT = "exit";
    public static final String ANSWERING = "Отвечает ";
    public static final String NOT_EXIST = "Студента с таким номером не существует";
    public static final String INTEGER_REQUIRED = "Нужно ввести целое число";

    static List<String> studentsJournal = Arrays.asList(
            "Тимур Мясной"
            , "Пенелопа Сиволап"
            , "Орест Злобин"
            , "Ирида Продувалова"
            , "Гектор Гадюкин"
            , "Электра Чемоданова"
            , "Гвидон Недумов"
            , "Роксана Борисенко"
            , "Юлиан Мумбриков"
            , "Зигфрид Горемыкин");

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print(PROMPT_STRING);
            String input = scanner.nextLine();
            if (input.toLowerCase().equals(EXIT)) {
                break;
            }

            int studentId;

            try {
                studentId = Integer.parseInt(input);
                System.out.println(ANSWERING + studentsJournal.get(studentId));
            } catch (NumberFormatException e) {
                System.out.println(INTEGER_REQUIRED);
            } catch (Exception e) {
                System.out.println(NOT_EXIST);
            }
        }
    }
}