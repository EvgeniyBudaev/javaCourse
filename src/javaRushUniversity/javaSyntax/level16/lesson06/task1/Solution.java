package javaRushUniversity.javaSyntax.level16.lesson06.task1; // task12.task1220;

import java.util.ArrayList;

/*
Охотники за привидением: в погоне за типами
*/

/* В методе main создается и заполняется список разными объектами и передается методу
checkElementType(ArrayList<Object>). Твоя задача — реализовать этот метод, который должен определить тип каждого
элемента списка, а также:

    Для типа String вызывать printString();
    Для типа Integer вызывать printInteger();
    Для типа Integer[] вызывать printIntegerArray();
    Для всех остальных типов вызывать printUnknown().

Метод main не участвует в проверке. */

public class Solution {

    public static void main(String[] args) {
        var elements = new ArrayList<>();
        elements.add("Привет");
        elements.add(10);
        elements.add(new Integer[15]);
        elements.add(new LinkageError());

        checkElementsType(elements);
    }

    public static void checkElementsType(ArrayList<Object> elements) {
        //напишите тут ваш код
        for(Object el: elements) {
            if (el instanceof String) {
                printString();
            } else if (el instanceof Integer) {
                printInteger();
            } else if (el instanceof Integer[]) {
                printIntegerArray();
            } else {
                printUnknown();
            }
        }
    }

    public static void printString() {
        System.out.println("Строка");
    }

    public static void printInteger() {
        System.out.println("Целое число");
    }

    public static void printIntegerArray() {
        System.out.println("Массив целых чисел");
    }

    public static void printUnknown() {
        System.out.println("Другой тип данных");
    }
}
