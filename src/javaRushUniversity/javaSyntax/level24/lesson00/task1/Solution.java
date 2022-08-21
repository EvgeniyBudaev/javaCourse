package javaRushUniversity.javaSyntax.level24.lesson00.task1; // com.javarush.task.pro.task15.task1524;

import java.io.*;
import java.util.Scanner;

/*
Перепутанные байты
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        Scanner scanner = new Scanner(System.in);

        try(FileInputStream inputStream = new FileInputStream(scanner.nextLine());
            FileOutputStream outputStream = new FileOutputStream(scanner.nextLine()))
        {
            byte[] buffer = new byte[2];
            while (inputStream.available() > 0) {
                int counter = inputStream.read(buffer);
                if (counter == 2) {
                    outputStream.write(buffer[1]);
                    outputStream.write(buffer[0]);
                }
                if (counter == 1) {
                    outputStream.write(buffer[0]);
                }
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}