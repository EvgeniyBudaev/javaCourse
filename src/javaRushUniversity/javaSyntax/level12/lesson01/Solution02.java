package javaRushUniversity.javaSyntax.level12.lesson01; // task07.task0709;

/*
Очень правильные типы
*/

/* Расставь операторы приведения типов в выражениях таким образом, чтобы код компилировался.
Изменять типы переменных a, b, c и d нельзя. Оператор приведения типа не должен отличаться от типа переменной. */

public class Solution02 {
    long a = 109 + 15;
    int b = (int) (a * 2);
    short c = (short) (a / b);
    byte d = (byte) (a + b - c);
}
