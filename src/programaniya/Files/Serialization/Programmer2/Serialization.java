package programaniya.Files.Serialization.Programmer2;

import programaniya.Files.Serialization.Programmer1.Employee;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Serialization {
    public static void main(String[] args) throws ClassNotFoundException {
        Employee employee;

        try(ObjectInputStream inputStream = new ObjectInputStream(
                new FileInputStream("D:\\" +
                        "Dev\\Java\\javaCourse\\src\\programaniya\\Files\\Serialization\\Programmer1\\employees2.bin"));
                ) {
            employee = (Employee) inputStream.readObject();
            System.out.println(employee);
            // Employees{name='Mariya', department='IT', age=28, salary=500.0,
            // car=Car{model='Nissan Tilda', color='White'}}
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
