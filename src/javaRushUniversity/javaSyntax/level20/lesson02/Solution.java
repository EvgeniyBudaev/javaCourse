package javaRushUniversity.javaSyntax.level20.lesson02; // task13.task1330;

/* MySingleton — это пример реализации паттерна синглтон с помощью перечисления.

Сделай так, чтобы при вызове метода main перед строкой "Экземпляр синглтона: INSTANCE" на экран вывелась строка
"создание экземпляра...".

Сделать это нужно, не внося изменений в класс Solution. */

public class Solution {
    public static void main(String[] args) {
        System.out.println("Экземпляр синглтона: " + MySingleton.INSTANCE);
    }
}
