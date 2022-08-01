package javaRushUniversity.javaSyntax.level20.lesson00.task2; // task13.task1316;

/* В enum JavarushQuest хранится список квестов. Твоя задача — получить массив всех элементов в методе main (используй
метод values()) и вывести порядковый номер каждого из них (используй метод ordinal()) с новой строки. */

public class Solution {

    public static void main(String[] args) {
        //напишите тут ваш код
        JavarushQuest[] items = JavarushQuest.values();
        for (JavarushQuest item: items)
            System.out.println(item.ordinal());
    }
}
