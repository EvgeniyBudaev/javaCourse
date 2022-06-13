package alishev.base.arrays;

import java.util.Arrays;

public class Array {
    public static void main(String[] args) {
        int[] numbers = new int[10]; // массив на 10 элементов
        String[] text = new String[5];
        System.out.println("text[0] " + text[0]); // null

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = i * 10;
        }

        for (int num : numbers){
            System.out.println(num);
        }

        int[] numbers2 = {167, -2, 16, 99, 26, 92, 43, -234, 35, 80};

        System.out.println(Arrays.toString(numbers2));

        // Двумерный массив
        int[][] matrix = {{1, 2, 3}, {4, 5, 6}};
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
