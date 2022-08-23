package javaRushUniversity.javaSyntax.level26.lesson05.task4; // com.javarush.task.pro.task15.task1519;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

/*
Поверхностное копирование
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        Path sourceDirectory = Path.of(scanner.nextLine());
        Path targetDirectory = Path.of(scanner.nextLine());
        //напишите тут ваш код
        copyFiles(sourceDirectory, targetDirectory);
    }

    static void copyFiles(Path sourceDirectory, Path targetDirectory) {
        try (DirectoryStream<Path> directoryStreamFirst = Files.newDirectoryStream(sourceDirectory)) {
            for (Path value : directoryStreamFirst) {
                if (!Files.isDirectory(value)) {
                    Files.copy(value,targetDirectory.resolve(value.getFileName()));
                }
            }
        } catch (IOException e) {
            System.out.println("oops...");
        }
    }
}