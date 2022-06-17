package alishev.advanced.collections.linkedHashMap;

import java.util.LinkedHashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<Integer, String> map = new LinkedHashMap<>(); // гарантируется порядок пар ключ-значение
        testMap(map);
    }

    public static void testMap(Map<Integer, String> map) {
        map.put(40, "Bob");
        map.put(10, "Tommy");
        map.put(50, "Jack");
        map.put(60, "Neo");

        for (Map.Entry<Integer, String> entry: map.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue()); // 40 : Bob, 40 : Bob, 50 : Jack, 60 : Neo
        }
    }
}
