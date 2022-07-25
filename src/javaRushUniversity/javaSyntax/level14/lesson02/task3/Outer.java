package javaRushUniversity.javaSyntax.level14.lesson02.task3;

/*
Объекты внутренних и вложенных классов
*/

public class Outer {
    class Inner {
        Inner() {
            System.out.println("Создание объекта внутреннего класса");
        }
    }
    static class Nested {
        Nested() {
            System.out.println("Создание объекта вложенного класса");
        }
    }
}
