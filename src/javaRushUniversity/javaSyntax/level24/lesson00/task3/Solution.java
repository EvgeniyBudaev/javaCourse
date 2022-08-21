package javaRushUniversity.javaSyntax.level24.lesson00.task3; // com.javarush.task.pro.task15.task1526;

import java.io.*;
import java.util.Scanner;

/*
Фейсконтроль
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        try (Scanner scanner = new Scanner(System.in);
             FileReader reader = new FileReader(scanner.nextLine())) {
            while (reader.ready()) {
                char tempChar = (char) reader.read();
                if (tempChar != ' ' && tempChar != '.' && tempChar != ',') {
                    System.out.print(tempChar);
                }
            }
        } catch (Exception e) {
            System.out.println("Something went wrong : " + e);
        }
    }
}