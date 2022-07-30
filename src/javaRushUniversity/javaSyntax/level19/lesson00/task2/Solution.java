package javaRushUniversity.javaSyntax.level19.lesson00.task2; // task13.task1314;

/*
StringsLinkedList, часть 2
*/

/* Решая эту задачу, ты научишься извлекать элемент из двусвязного списка.
Мы реализовали метод add, который добавляет элементы в конец списка. Тебе нужно реализовать метод get(int), который
вернет строку под индексом, переданным в метод. Если строки с таким индексом нет, нужно вернуть null.
Помни, что first и last не имеют значений, а ссылаются только на первый и последний элемент соответственно. */

public class Solution {

    public static void main(String[] args) {
        StringsLinkedList stringsLinkedList = new StringsLinkedList();
        stringsLinkedList.add("1");
        stringsLinkedList.add("2");
        stringsLinkedList.add("3");
        stringsLinkedList.add("4");
        stringsLinkedList.add("5");
        stringsLinkedList.add("6");
        stringsLinkedList.add("7");
        stringsLinkedList.add("8");
        stringsLinkedList.add("9");
        System.out.println(stringsLinkedList.get(4)); // 5
    }
}
