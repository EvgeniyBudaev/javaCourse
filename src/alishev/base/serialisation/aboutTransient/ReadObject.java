package alishev.base.serialisation.aboutTransient;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ReadObject {
    public static void main(String[] args) {
        String path = "src/alishev/base/serialisation/aboutTransient/people.bin";
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(path))) {
            Person person1 = (Person) ois.readObject();
            System.out.println(person1);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) { // если в проекте нет класса, который мы считываем из файла
            throw new RuntimeException(e);
        }
    }
}
