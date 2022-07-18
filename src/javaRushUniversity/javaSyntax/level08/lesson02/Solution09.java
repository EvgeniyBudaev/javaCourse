package javaRushUniversity.javaSyntax.level08.lesson02; // task06.task0635;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.OptionalInt;
import java.util.Random;
import java.util.Scanner;

/*
Идентификатор QR-кодов
*/

/* Идентификатор QR-кодов

Давай напишем программу идентификации псевдо QR-кодов. В программе дан двумерный массив expectedArray размером 3*3.
В этом массиве хранится псевдо QR-код. Тебе в помощь реализовано рандомное заполнение этого массива — при желании можешь
 заполнить его самостоятельно, это на тесты не влияет.
Тебе необходимо написать код для заполнения массива actualArray значениями с клавиатуры (считываем по одному символу,
 пустая клетка — пробел, закрашенная — #).
Далее, используя правильный метод класса Arrays, необходимо сравнить этот массив с массивом expectedArray и вывести на
 экран результат сравнения: true, если массивы одинаковы и false, если они разные.
 */

public class Solution09 {
    public static String[][] expectedArray = new String[3][3];
    public static String[][] actualArray = new String[3][3];

    static {
        Random random = new Random();
        for (int i = 0; i < expectedArray.length; i++) {
            for (int j = 0; j < expectedArray[0].length; j++) {
                OptionalInt optionalInt = random.ints(0, 2).findFirst();
                expectedArray[i][j] = optionalInt.isPresent() && optionalInt.getAsInt() == 1 ? " " : "#";
            }
        }
    }

    public static void main(String[] args) throws IOException {
        //напишите тут ваш код
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < actualArray.length; i++) {
            for (int j = 0; j < actualArray[i].length; j++) {
                actualArray[i][j] = scanner.nextLine();
            }
        }

        Boolean result = Arrays.deepEquals(expectedArray, actualArray);
        System.out.println(result);
    }
}
