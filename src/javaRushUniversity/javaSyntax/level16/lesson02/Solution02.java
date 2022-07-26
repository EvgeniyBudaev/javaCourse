package javaRushUniversity.javaSyntax.level16.lesson02; // task12.task1210;

import java.util.ArrayList;

/*
Переворачивание данных
*/

/* Ты видишь рабочую программу, в которой массив int[] numbers заполняется числами в методе init(). Затем в методе
reverse() происходит перестановка чисел в обратном порядке. Твоя задача — переписать код так, чтобы вместо массива int[]
numbers использовался список ArrayList<Integer> numbers. Название методов и переменных не изменяй. Методы main() и
print() не принимают участие в проверке. */

public class Solution02 {
    public static ArrayList<Integer> numbers = new ArrayList<>();

    public static void main(String[] args) {
        init();
        print();

        reverse();
        print();
    }

    public static void init() {
        for (int i = 0; i < 10; i++) {
            numbers.add(i);
        }
    }

    public static void reverse() {
        ArrayList<Integer> tempList = new ArrayList<>(10);
        for (int i = numbers.size(); i > 0; i--) {
            tempList.add(numbers.get(i - 1));
        }
        numbers = tempList;
    }

    private static void print() {
        for (int number : numbers) {
            System.out.println(number);
        }
    }
}