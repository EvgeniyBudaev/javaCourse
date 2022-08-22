package javaRushUniversity.javaSyntax.level26.lesson05.task1; // com.javarush.task.pro.task15.task1516;

import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

/*
Файл или директория
*/

public class Solution {
    private static final String THIS_IS_FILE = " - это файл";
    private static final String THIS_IS_DIR = " - это директория";

    public static void main(String[] args) {
        //напишите тут ваш код
        Scanner scanner = new Scanner(System.in);
        String path;
        do {
            path = scanner.nextLine();
            if (Files.isRegularFile(Path.of(path))) {
                System.out.println(path + THIS_IS_FILE);
            } else if (Files.isDirectory(Path.of(path))) {
                System.out.println(path + THIS_IS_DIR);
            }
        } while ((Files.isRegularFile(Path.of(path)) || Files.isDirectory(Path.of(path))));
    }
}