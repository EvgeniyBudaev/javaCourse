package alishev.advanced.collections.iterable;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);

        Iterator<Integer> iterator = list.iterator();

        int idx = 0;
        // Before Java5
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
            if (idx == 1) {
                iterator.remove();
            }
            idx++;
        }
        System.out.println(list); // [1, 3]


        System.out.println();
        // Java 5
        for (int x:list)
            System.out.println(x);
    }
}
