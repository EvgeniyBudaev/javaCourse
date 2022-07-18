package javaRushUniversity.javaSyntax.level04.lesson02; // task03.task0304;

import java.util.Scanner;

/*
Измерим температуру тела
*/

/* Измерим температуру тела

Программа считывает с клавиатуры значение температуры тела и выдает сообщение о том, что температура тела высокая,
 низкая или нормальная, в зависимости от условий.
В классе объявлены две булевые переменные isHigh (высокая температура) и isLow (низкая), в которые нужно вынести
соответствующие условия и вместо выражений сравнения использовать эти переменные.
 */

public class Solution01 {
    private static boolean isHigh;
    private static boolean isLow;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double bodyTemperature = scanner.nextDouble();
        //напишите тут ваш код
        isHigh = bodyTemperature > 37;
        isLow = bodyTemperature < 36;
        if (isHigh) {
            System.out.println("температура тела высокая");
        } else if (isLow ){
            System.out.println("температура тела низкая");
        } else {
            System.out.println("температура тела нормальная");
        }
    }
}
