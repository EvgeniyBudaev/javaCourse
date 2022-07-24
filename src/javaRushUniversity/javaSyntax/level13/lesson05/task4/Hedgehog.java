package javaRushUniversity.javaSyntax.level13.lesson05.task4; // task10.task1015;

/*
Ежик и яблоко
*/

/* Наша задача — накормить ежика. Нужно в методе main создать один объект Apple и один объект Hedgehog, у которого
вызвать метод eat и передать нужный аргумент — яблоко. */

public class Hedgehog {

    public void eat(Apple apple) {
        System.out.println("Яблоко было съедено!");
    }

    public static void main(String[] args) {
        //напишите тут ваш код
        Apple apple = new Apple();
        Hedgehog hedgehog = new Hedgehog();
        hedgehog.eat(apple);
    }

    public static class Apple {
    }
}
