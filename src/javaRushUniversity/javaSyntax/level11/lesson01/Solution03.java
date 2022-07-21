package javaRushUniversity.javaSyntax.level11.lesson01; // task09.task0907;

import java.util.regex.Pattern;

/*
Шестнадцатеричный конвертер
*/

/* Шестнадцатеричный конвертер

Публичный статический метод toHex(int) должен переводить целое число, полученное в качестве входящего параметра, из
десятичной системы счисления в шестнадцатеричную и возвращать его строковое представление. А публичный статический метод
toDecimal(String) наоборот — из строкового представления шестнадцатеричного числа в десятичное число.
Методы работают только с положительными числами и не пустыми строками. Если входящий параметр меньше или равен 0, метод
toHex(int) возвращает пустую строку. Если входящий параметр — пустая строка или null, то метод toDecimal(String)
возвращает 0.
Твоя задача реализовать эти методы.

Также в классе Solution есть константа HEX, которая содержит в себе все символы, используемые в шестнадцатеричной
системе. */

public class Solution03 {
    private static final String HEX = "0123456789abcdef";

    public static void main(String[] args) {
        int decimalNumber = 1256;
        System.out.println("Десятичное число " + decimalNumber + " равно шестнадцатеричному числу " + toHex(decimalNumber));
        String hexNumber = "4e8";
        System.out.println("Шестнадцатеричное число " + hexNumber + " равно десятичному числу " + toDecimal(hexNumber));
    }

    public static String toHex(int decimalNumber) {
        //напишите тут ваш код
        String hexNumber = "";
        if (decimalNumber <= 0) {
            return hexNumber;
        }
        while (decimalNumber != 0) {
            hexNumber = HEX.charAt(decimalNumber % 16) + hexNumber;
            decimalNumber = decimalNumber / 16;
        }
        return hexNumber;
    }

    public static int toDecimal(String hexNumber) {
        //напишите тут ваш код
        int decimalNumber = 0;
        if (hexNumber == null) {
            return decimalNumber;
        }
        for (int i = 0; i < hexNumber.length(); i++) {
            decimalNumber = 16 * decimalNumber + HEX.indexOf(hexNumber.charAt(i));
        }
        return decimalNumber;
    }
}
