package javaRushUniversity.javaSyntax.level12.lesson00; // task07.task0705;

/*
Бесконечность не предел
*/

/* В методе main вызови метод div() 2 раза. Первый раз — с такими аргументами, чтобы вывод в консоли был "Infinity",
а второй — "-Infinity". Код метода div() изменять нельзя. */

public class Solution05 {
    public static void main(String[] args) {
        //напишите тут ваш код
        div(0, 100);
        div(0, -100);
    }

    public static void div(double a, double b){
        System.out.println(b/a);
    }
}
