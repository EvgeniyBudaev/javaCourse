package javaRushUniversity.javaSyntax.level26.lesson02.task2; // com.javarush.task.pro.task15.task1535;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

/*
Собираем файл
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        splitFile("C:\\test\\file.txt", 1024);
    }

    public static void splitFile(String fileName, int partSize) throws IOException {
        try (FileChannel inputChannel = FileChannel.open(Paths.get(fileName))) {
            //напишите тут ваш код
            ByteBuffer buf = ByteBuffer.allocate(partSize);
            int counter = 1;
            while (inputChannel.read(buf) > 0) {
                Path outputFilePath = Paths.get(getNewFileName(fileName, counter));
                counter++;
                if (Files.notExists(outputFilePath)) {
                    Files.createFile(outputFilePath);
                }
                try (FileChannel outputChannel = FileChannel.open(outputFilePath, StandardOpenOption.WRITE)) {
                    buf.flip();
                    outputChannel.write(buf);
                    buf.clear();
                }
            }
        }
    }

    public static String getNewFileName(String oldFileName, int number) {
        int dotIndex = oldFileName.lastIndexOf(".");
        return oldFileName.substring(0, dotIndex) + number + oldFileName.substring(dotIndex);
    }
}