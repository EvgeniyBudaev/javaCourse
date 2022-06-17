package alishev.advanced.collections.treeMap;

import java.util.Map;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        Map<Integer, String> map = new TreeMap<>(); // гарантирует что пары ключ-значение будут отсортированы по ключу
        testMap(map);
    }

    public static void testMap(Map<Integer, String> map) {
        map.put(40, "Bob");
        map.put(10, "Tommy");
        map.put(50, "Jack");
        map.put(60, "Neo");

        for (Map.Entry<Integer, String> entry: map.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue()); // 10 : Tommy, 40 : Bob, 50 : Jack, 60 : Neo
        }
    }
}
