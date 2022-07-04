package programaniya.Files.Serialization.Programmer2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> employees;
        try(ObjectInputStream inputStream = new ObjectInputStream(
                new FileInputStream("D:\\" +
                        "Dev\\Java\\javaCourse\\src\\programaniya\\Files\\Serialization\\Programmer1\\employees1.bin"));
                ) {
            employees = (ArrayList)inputStream.readObject();
            System.out.println(employees); // [Ivan, Elena, Marina]
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
