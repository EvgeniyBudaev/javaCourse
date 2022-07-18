package javaRushUniversity.javaSyntax.level04.lesson00; // task03.task0301;

import java.util.Scanner;

/*
Тепло или холодно
*/

/* Ввести с клавиатуры температуру на улице. Если температура меньше 0, вывести надпись "на улице холодно",
 иначе - вывести надпись "на улице тепло". */

public class Solution01 {
    public static void main(String[] args) {
        String cold = "на улице холодно";
        String warm = "на улице тепло";
        //напишите тут ваш код
        Scanner scanner = new Scanner(System.in);
        int temp = scanner.nextInt();
        if (temp < 0) {
            System.out.println("на улице холодно");
        } else {
            System.out.println("на улице тепло");
        }
    }
}
