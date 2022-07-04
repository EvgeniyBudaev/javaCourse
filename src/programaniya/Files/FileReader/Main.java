package programaniya.Files.FileReader;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        FileReader reader = null;
        try {
            reader = new FileReader("D:\\Dev\\Java\\javaCourse\\src\\programaniya\\Files\\FileReader\\test.txt");
            int character;
            while ((character = reader.read()) != -1) {
                System.out.print((char)character);
            }
            System.out.println();
            System.out.println("Done!");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            reader.close();
        }
    }
}
