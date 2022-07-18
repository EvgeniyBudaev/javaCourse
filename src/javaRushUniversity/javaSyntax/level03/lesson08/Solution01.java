package javaRushUniversity.javaSyntax.level03.lesson08; // task05.task0520;

/*
Переобуваемся на лету
*/

/* Потренируйся определять и изменять значения переменных во время выполнения программы:

    Поставь break point напротив вызова метода println и запусти программу в режиме отладки.
    После остановки нажми F8 ровно 9 раз.
    Посмотри, какое значение сейчас у переменной correction и установи такое же значение переменной fahrenheit (в окне отладки).
    Нажми F8 еще 6 раз.
    Посмотри текущее значение переменной correction и присвой это значение полю result (измени исходный код).

В итоге в классе Solution должно быть только одно изменение: поле result должно быть инициализировано при объявлении.
 */

public class Solution01 {
    public static int result = 105;

    public static void main(String[] args) {
        byte correction = Byte.MAX_VALUE;
        for (double fahrenheit = -459.67; fahrenheit < 451; fahrenheit += 40) {
            correction *= fahrenheit;
            System.out.println(correction);
        }
    }
}
