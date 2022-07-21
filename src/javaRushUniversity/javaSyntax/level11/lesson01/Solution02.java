package javaRushUniversity.javaSyntax.level11.lesson01; // task09.task0906;

import java.util.regex.Pattern;

/*
Двоичный конвертер
*/

/* Публичный статический метод toBinary(int) должен переводить целое число, полученное в качестве входящего параметра,
из десятичной системы счисления в двоичную и возвращать его строковое представление. А публичный статический метод
toDecimal(String) наоборот — из строкового представления двоичного числа в десятичное число.
Методы работают только с положительными числами и не пустыми строками. Если входящий параметр меньше или равен 0, метод
toBinary(int) возвращает пустую строку. Если входящий параметр — пустая строка или null, то метод toDecimal(String)
возвращает 0. Твоя задача — реализовать эти методы. */

public class Solution02 {
    public static void main(String[] args) {
        int decimalNumber = Integer.MAX_VALUE;
        System.out.println("Десятичное число " + decimalNumber + " равно двоичному числу " + toBinary(decimalNumber));
        String binaryNumber = "1111111111111111111111111111111";
        System.out.println("Двоичное число " + binaryNumber + " равно десятичному числу " + toDecimal(binaryNumber));
    }

    public static String toBinary(int decimalNumber) {
        //напишите тут ваш код
        String binaryNumber = "";
        if (decimalNumber <= 0) {
            return binaryNumber;
        }

        while (decimalNumber != 0) {
            binaryNumber = decimalNumber % 2 + binaryNumber;
            decimalNumber = decimalNumber / 2;
        }
        return binaryNumber;
    }

    public static int toDecimal(String binaryNumber) {
        //напишите тут ваш код
        int decimalNumber = 0;
        if (binaryNumber == null) {
            return decimalNumber;
        }

        for (int i = 0; i < binaryNumber.length(); i++) {
            int index = binaryNumber.length() - 1 - i;
            int value = Character.getNumericValue(binaryNumber.charAt(index));
            decimalNumber += value * Math.pow(2, i);
        }
        return decimalNumber;
    }
}
