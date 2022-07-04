package programaniya.Files.FileWriter;

import java.io.FileWriter;
import java.io.IOException;

public class Main {
    /* Character Streams and Byte Streams */
    /* Stream (поток) для работы с файлами - это упорядоченная последовательность данных. */

    public static void main(String[] args) throws IOException {
        String text = "Lorem ipsum";
        String text2 = "Hello world";
        FileWriter writer = null;
        try {
            // Если хотим добавить текст в конец
            writer = new FileWriter("D:\\Dev\\Java\\javaCourse\\src\\programaniya\\Files\\FileWriter\\test.txt", true);
//            for (int i = 0; i < text.length(); i++) {
//                writer.write(text.charAt(i)); // автоматический кастинг до int
//            }
            writer.write(text);
            writer.write(text2);
            System.out.println("Done!");
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            writer.close();
        }
    }
}
