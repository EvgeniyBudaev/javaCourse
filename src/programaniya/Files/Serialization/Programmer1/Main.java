package programaniya.Files.Serialization.Programmer1;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> employees = new ArrayList<>();
        employees.add("Ivan");
        employees.add("Elena");
        employees.add("Marina");
        try(ObjectOutputStream outputStream = new ObjectOutputStream(
                new FileOutputStream("D:\\" +
                        "Dev\\Java\\javaCourse\\src\\programaniya\\Files\\Serialization\\Programmer1\\employees1.bin"));
                ) {
            outputStream.writeObject(employees);
            System.out.println("Done!");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
