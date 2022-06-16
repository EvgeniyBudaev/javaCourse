package alishev.base.failZapis;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class WriteToFile {
    public static void main(String[] args) throws FileNotFoundException {
        String filePath = "src/alishev/base/failZapis/testFile.txt";
        File file = new File(filePath);
        PrintWriter pw = new PrintWriter(file); // PrintWriter для записи только текстовых значений

        pw.println("Lorem ipsum");

        pw.close();
    }
}
