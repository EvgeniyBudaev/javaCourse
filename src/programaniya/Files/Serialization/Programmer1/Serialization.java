package programaniya.Files.Serialization.Programmer1;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Serialization {
    public static void main(String[] args) {
        Car car = new Car("Nissan Tilda", "White");
        Employee employee = new Employee("Mariya", "IT", 28, 500, car);
        try(ObjectOutputStream outputStream = new ObjectOutputStream(
                new FileOutputStream("D:\\" +
                        "Dev\\Java\\javaCourse\\src\\programaniya\\Files\\Serialization\\Programmer1\\employees2.bin"));
                ) {
            outputStream.writeObject(employee);
            System.out.println("Done!");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
