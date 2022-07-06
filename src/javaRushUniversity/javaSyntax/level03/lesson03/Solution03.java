package javaRushUniversity.javaSyntax.level03.lesson03;

import java.util.Scanner;

/*
Площадь круга
*/

/* Площадь круга

Для решения этой задачи нужно:

    Ввести с клавиатуры положительное целое число radius. Это будет радиус окружности.
    Вывести на экран площадь круга, рассчитанную по формуле: S = pi * radius * radius.

Результатом должно стать целое число (тип int). Для этого нужно привести к типу int результат умножения (отбросить дробную часть, округлив вниз до целого числа).
В качестве значения pi используй 3.14. */

public class Solution03 {
    public static void main(String[] args) {
        //напишите тут ваш код
        Scanner scanner = new Scanner(System.in);
        int radius = scanner.nextInt();
        int s = (int)(3.14 * radius * radius);
        System.out.println(s);
    }
}
