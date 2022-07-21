package javaRushUniversity.javaSyntax.level11.lesson01; // task09.task0905;

import java.util.regex.Pattern;

/*
Восьмеричный конвертер
*/

/* Публичный статический метод toOctal(int) должен переводить целое число, полученное в качестве входящего параметра, из
десятичной системы счисления в восьмеричную. А публичный статический метод toDecimal(int) наоборот — из восьмеричной в
десятичную. Методы работают только с положительными числами. Если входящий параметр меньше или равен 0, методы
возвращают 0. Твоя задача — реализовать эти методы. */

public class Solution01 {
    public static void main(String[] args) {
        int decimalNumber = 21;
        System.out.println("Десятичное число " + decimalNumber + " равно восьмеричному числу " + toOctal(decimalNumber));
        int octalNumber = 25;
        System.out.println("Восьмеричное число " + octalNumber + " равно десятичному числу " + toDecimal(octalNumber));
    }

    public static int toOctal(int decimalNumber) {
        //напишите тут ваш код
        int octalNumber = 0;
        if (decimalNumber <= 0) {
            return octalNumber;
        }

        int i = 0;
        while (decimalNumber != 0) {
            octalNumber = (int) (octalNumber + (decimalNumber % 8) * Math.pow(10, i++));
            decimalNumber = decimalNumber / 8;
        }
        return octalNumber;
    }

    public static int toDecimal(int octalNumber) {
        //напишите тут ваш код
        int decimalNumber = 0;
        if (octalNumber <= 0) {
            return decimalNumber;
        }

        int i = 0;
        while (octalNumber != 0) {
            decimalNumber = (int) (decimalNumber + (octalNumber % 10) * Math.pow(8, i++));
            octalNumber = octalNumber / 10;
        }
        return decimalNumber;
    }
}
