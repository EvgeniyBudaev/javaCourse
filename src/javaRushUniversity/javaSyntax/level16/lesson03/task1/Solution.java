package javaRushUniversity.javaSyntax.level16.lesson03.task1; // task12.task1212;

/* ArrayList — это список, который хранит динамически расширяемый массив элементов. Сейчас мы будем реализовывать свою
версию списка, в котором хранятся строки. В классе CustomStringArrayList есть три поля:

    String[] elements — это массив текущих элементов (в похожем массиве хранит значения ArrayList). Изначально его
    размер равен 10 (capacity = 10).
    int size — в нем хранится количество заполненных элементов, начальное значение — 0.
    int capacity — вместимость в текущем массиве (elements) данных, которая будет увеличиваться по ходу добавления
     данных. */

public class Solution {

    public static void main(String[] args) {
        CustomStringArrayList arrayList = new CustomStringArrayList();
        for(int i = 0; i < 25; i++) {
            arrayList.add("count" + i);
        }
    }
}