package javaRushUniversity.javaSyntax.level08.lesson02;

import java.util.Arrays;
import java.util.Scanner;

/*
Первая база данных
*/

/* Первая база данных

В классе Solution дан двумерный массив строк (поле array), содержащий данные о студентах. В каждой строке первый элемент
 — это идентификатор студента, второй — его фамилия, третий — имя. */

public class Solution04 {
    public static String[][] array = new String[][]{{"123", "Иванов", "Богдан"},
            {"1425", "Петрова", "Марина"},
            {"37", "Богдан", "Андрей"},
            {"98", "Богданова", "Марина"},
            {"6285", "Прутко", "Сергей"},
            {"8", "Клочкова", "Елена"},
            {"754", "Котов", "Иван"}};

    public static void main(String[] args) {
        //напишите тут ваш код
        Scanner scanner = new Scanner(System.in);
        String searchValue = scanner.nextLine();

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (searchValue.equals(array[i][j])) {
                    System.out.println(array[i][0] + " " + array[i][1] + " " + array[i][2]);
                }
            }
        }
    }
}
