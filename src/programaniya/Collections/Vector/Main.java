package programaniya.Collections.Vector;

import java.util.Vector;

public class Main {
    public static void main(String[] args) {
        Vector<String> vector = new Vector<>();
        vector.add("F");
        vector.add("B");
        vector.add("A");
        System.out.println(vector); // [F, B, A]
        System.out.println(vector.firstElement()); // F
        System.out.println(vector.lastElement()); // A
        System.out.println(vector.get(0)); // F
        vector.remove(2);
    }
}
