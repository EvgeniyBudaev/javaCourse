package javaRushUniversity.javaSyntax.level08.lesson01; // task05.task0512;

/*
Создаем мультимассив
*/

/* В методе main(String[]) выведи на экран все числа из трехмерного массива multiArray. */

public class Solution03 {
    public static int[][][] multiArray = new int[][][]{{{4, 8, 15}, {16}}, {{23, 42}, {}}, {{1}, {2}, {3}, {4, 5}}};

    public static void main(String[] args) {
        //напишите тут ваш код
        for (int[][] ints : multiArray) {
            for (int[] anInt : ints) {
                for (int i : anInt) {
                    System.out.println(i);
                }
            }
        }
    }
}
