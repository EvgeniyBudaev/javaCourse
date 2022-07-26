package javaRushUniversity.javaSyntax.level16.lesson06.task3; // task12.task1222;

import java.util.ArrayList;

/*
Выводим в консоли разные типы
*/

/* В классе Solution есть метод printAnything(ArrayList), который должен принимать список и выводить его содержимое в
консоли. Сейчас на вход принимается только список строк. Твоя задача исправить метод так, чтобы принимался список с
любыми типами данных (для этого нужно удалить соответствующий дженерик). Метод main не участвует в проверке. */

public class Solution {

    public static void printAnything(ArrayList arrayList) {
        for (int i = 0; i < arrayList.size(); i++) {
            System.out.println(arrayList.get(i));
        }
    }

    public static void main(String[] args) {
        var arrayList = new ArrayList<>();
        arrayList.add(15);
        arrayList.add("Hello");
        arrayList.add(154);
        arrayList.add("string");

        printAnything(arrayList);
    }
}
