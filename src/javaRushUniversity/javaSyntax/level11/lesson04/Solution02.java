package javaRushUniversity.javaSyntax.level11.lesson04; // task05.task0514;

import java.util.Arrays;

/*
Выводим двумерные массивы
*/

/* Реализуй метод main(String[]), который выводит массивы strings и ints в консоли c помощью метода
 Arrays.deepToString(Object[][]). */

public class Solution02 {
    public static String[][] strings = new String[][]{{"🙂", "🙂", "🙂", "🙂"}, {"🙃", "🙃", "🙃", "🙃"}, {"😋", "😋", "😋", "😋"}, {"😎", "😎", "😎", "😎"}};
    public static int[][] ints = new int[][]{{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}, {13, 14, 15, 16}};

    public static void main(String[] args) {
        //напишите тут ваш код
        System.out.println(Arrays.deepToString(strings));
        System.out.println(Arrays.deepToString(ints));
    }
}
