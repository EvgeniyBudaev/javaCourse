package alishev.advanced.collections.linkedList;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> linkedList = new LinkedList<>();
//        linkedList.add(1);
//        linkedList.get(0); // 1
//        linkedList.size(); // 1
//        linkedList.remove(0);

        List<Integer> arrayList = new ArrayList<>();

        System.out.println("Add to end");
        measureTimeAddToEnd(linkedList);
        measureTimeAddToEnd(arrayList);
        System.out.println("Add to start");
        measureTimeAddToStart(linkedList);
        measureTimeAddToStart(arrayList);
        System.out.println("Get");
        measureTimeGet(linkedList);
        measureTimeGet(arrayList);
    }

    private static void measureTimeAddToEnd(List<Integer> list) {
        long start = System.currentTimeMillis();

        for (int i = 0; i < 10000000; i++) {
            list.add(i);
        }

        long end = System.currentTimeMillis();
        System.out.println(end - start);
    }

    private static void measureTimeAddToStart(List<Integer> list) {
        long start = System.currentTimeMillis();

        for (int i = 0; i < 100; i++) {
            list.add(0, i);
        }

        long end = System.currentTimeMillis();
        System.out.println(end - start);
    }

    private static void measureTimeGet(List<Integer> list) {
        for (int i = 0; i < 100; i++) {
            list.add(i);
        }

        long start = System.currentTimeMillis();

        for (int i = 0; i < 10000; i++) {
            list.get(i);
        }

        long end = System.currentTimeMillis();
        System.out.println(end - start);
    }
}
