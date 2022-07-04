package programaniya.Files.FileInputOutputStream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Main {
    // Лучше применять BufferedFileInputStream
    // FileInputStream и FileOutputStream используются для работы с бинарными файлами.
    // FileInputStream - чтение

    public static void main(String[] args) {
        try (FileInputStream inputStream = new FileInputStream("D:\\" +
                "Dev\\Java\\javaCourse\\src\\programaniya\\Files\\FileInputOutputStream\\java.jpg");
             FileOutputStream outputStream = new FileOutputStream("D:\\" +
                     "Dev\\Java\\javaCourse\\src\\programaniya\\Files\\FileInputOutputStream\\javaCopy.jpg");
        ) {
            int i;
            while ((i=inputStream.read()) != -1) {
                outputStream.write(i);
            }
            System.out.println("Done!");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
