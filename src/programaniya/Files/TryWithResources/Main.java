package programaniya.Files.TryWithResources;

import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        String text = "Lorem ipsum";

        try(FileWriter writer = new FileWriter("D:\\Dev\\Java\\javaCourse\\src\\programaniya\\Files\\FileWriter\\test.txt", true)) {
            writer.write(text);
            System.out.println("Done!");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
