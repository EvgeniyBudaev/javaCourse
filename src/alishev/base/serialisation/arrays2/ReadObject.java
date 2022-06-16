package alishev.base.serialisation.arrays2;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.Arrays;

public class ReadObject {
    public static void main(String[] args) {
        String path = "src/alishev/base/serialisation/arrays2/people.bin";
        try {
            FileInputStream fis = new FileInputStream(path);
            ObjectInputStream ois = new ObjectInputStream(fis);

            Person[] people = (Person[]) ois.readObject();

            System.out.println(Arrays.toString(people));

            ois.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) { // если в проекте нет класса, который мы считываем из файла
            throw new RuntimeException(e);
        }
    }
}
