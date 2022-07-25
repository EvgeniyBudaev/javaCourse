package javaRushUniversity.javaSyntax.level14.lesson02.task3; // task11.task1109;

/*
Объекты внутренних и вложенных классов
*/

/* В классе Outer есть внутренний (Inner) и вложенный (Nested) классы. В методе main класса Solution создай по одному
объекту каждого из них. */

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        Outer outer = new Outer();
        Outer.Inner inner = outer.new Inner();
        Outer.Nested nested = new Outer.Nested();
    }
}
