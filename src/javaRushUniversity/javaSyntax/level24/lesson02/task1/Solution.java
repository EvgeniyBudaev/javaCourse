package javaRushUniversity.javaSyntax.level24.lesson02.task1; // com.javarush.task.pro.task15.task1528;

import java.io.*;
import java.util.Scanner;

/*
Пишем байты в файл
*/

public class Solution {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in);
             FileOutputStream output = new FileOutputStream(scanner.nextLine())) {
            byte[] bytes = new byte[]{106, 97, 118, 97};
            output.write(bytes);
        } catch (IOException e) {
            System.out.println("Something went wrong : " + e);
        }
    }
}
