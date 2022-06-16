package alishev.base.serialisation;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class WriteObject {
    public static void main(String[] args) {
        Person person1 = new Person(1, "Bob");
        Person person2 = new Person(2, "Mike");

        try {
            String path = "src/alishev/base/serialisation/people.bin";
            FileOutputStream fos = new FileOutputStream(path); // запись байтов в файл
            ObjectOutputStream oos = new ObjectOutputStream(fos); // запись объектов в файл

            oos.writeObject(person1);
            oos.writeObject(person2);

            oos.close();

        }  catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
