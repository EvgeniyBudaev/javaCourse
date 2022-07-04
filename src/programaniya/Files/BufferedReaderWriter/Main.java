package programaniya.Files.BufferedReaderWriter;

import java.io.*;

// Copy

public class Main {
    /* Использование буферизации в стримах позволяет достичь большей эффективности при чтении файла или записи в него. */

    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(
                new FileReader("D:\\Dev\\Java\\javaCourse\\src\\programaniya\\Files\\FileReader\\test.txt"));
             BufferedWriter writer = new BufferedWriter(new FileWriter("D:\\Dev\\Java\\javaCourse\\src\\programaniya\\Files\\BufferedReaderWriter\\test3.txt"));
        ) {
//            int character;
//            while ((character = reader.read()) != -1) {
//                writer.write(character);
//            }
            String line;
            while ((line= reader.readLine()) != null) {
                writer.write(line);
                writer.write('\n');
            }
            System.out.println("Done!");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
