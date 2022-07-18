package javaRushUniversity.javaSyntax.level06.lesson03; // task04.task0411;

/*
Четные числа
*/

/*
Напиши программу, в которой с помощью цикла for на экран будут выведены чётные числа от 1 до 15.
Каждое значение нужно выводить с новой строки. */

public class Solution01 {
    public static void main(String[] args) {
        //напишите тут ваш код
        for (int i = 1; i <= 15; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }
}
