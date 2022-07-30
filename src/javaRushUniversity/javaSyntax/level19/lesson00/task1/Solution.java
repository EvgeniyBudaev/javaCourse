package javaRushUniversity.javaSyntax.level19.lesson00.task1; // task13.task1313;

/*
StringsLinkedList
*/

/* Пришло время познакомиться с двусвязным списком. Решая эту задачу ты поймешь, как работает двусвязный список и
сможешь добавлять в него элементы. У тебя есть класс StringsLinkedList, в котором есть поля first и last, указывающие на
первый и последний элемент соответственно. Тебе нужно реализовать логику метода add, который будет добавлять элементы
в список */

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
        stringsLinkedList.printAll();
    }
}
