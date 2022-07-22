package javaRushUniversity.javaSyntax.level12.lesson00; // task07.task0706;

/*
Странное деление
*/

/* В методе main вызови метод div() с таким аргументом, чтобы вывод в консоли был "NaN".
Код метода div() изменять нельзя. */

public class Solution06 {
    public static void main(String[] args) {
        //напишите тут ваш код
        div(0, 0);
    }

    public static void div(double a, double b){
        System.out.println(b/a);
    }
}
