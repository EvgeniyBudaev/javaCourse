package alishev.base.serialisation.arrays2;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class WriteObject {
    public static void main(String[] args) {
        Person[] people = {new Person(1, "Bob"), new Person(2, "Mike"), new Person(3, "Tom")};

        try {
            String path = "src/alishev/base/serialisation/arrays2/people.bin";
            FileOutputStream fos = new FileOutputStream(path); // запись байтов в файл
            ObjectOutputStream oos = new ObjectOutputStream(fos); // запись объектов в файл

            oos.writeObject(people);

            oos.close();

        }  catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
