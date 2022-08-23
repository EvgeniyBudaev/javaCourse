package javaRushUniversity.javaSyntax.level26.lesson05.task5; // com.javarush.task.pro.task15.task1520;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

/*
Перемещение файлов
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        Path sourceDirectory = Path.of(scanner.nextLine());
        Path targetDirectory = Path.of(scanner.nextLine());
        //напишите тут ваш код
        moveFiles(sourceDirectory, targetDirectory);
    }

    static void moveFiles(Path sourceDirectory, Path targetDirectory) {
        try (DirectoryStream<Path> directoryStreamFirst = Files.newDirectoryStream(sourceDirectory)) {
            for (Path value : directoryStreamFirst) {
                if (!Files.isDirectory(value)) {
                    Files.move(value,targetDirectory.resolve(value.getFileName()));
                }
            }
        } catch (IOException e) {
            System.out.println("oops...");
        }
    }
}
