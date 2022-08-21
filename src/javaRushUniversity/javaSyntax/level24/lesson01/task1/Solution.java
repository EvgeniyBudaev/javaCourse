package javaRushUniversity.javaSyntax.level24.lesson01.task1; // com.javarush.task.pro.task15.task1527;

import java.io.*;
import java.util.Scanner;

/*
 Пропускаем не всех
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        int counter = -1;
        try (Scanner scanner = new Scanner(System.in);
             FileReader in = new FileReader(scanner.nextLine());
             BufferedReader reader = new BufferedReader(in)) {
            while (reader.ready()) {
                String line = reader.readLine();
                counter++;
                if (counter % 2 == 0) {
                    System.out.println(line);
                }
            }
        } catch (Exception e) {
            System.out.println("Something went wrong : " + e);
        }
    }
}

