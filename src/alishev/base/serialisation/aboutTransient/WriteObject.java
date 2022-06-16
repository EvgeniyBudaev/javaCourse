package alishev.base.serialisation.aboutTransient;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class WriteObject {
    public static void main(String[] args) {
        String path = "src/alishev/base/serialisation/aboutTransient/people.bin";
        Person person1 = new Person(1, "Bob");

        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(path))) {
            oos.writeObject(person1);
        }  catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
