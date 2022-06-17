package alishev.advanced.collections.hashMap;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        // HashMap не гарантирует порядок хранения ключ-значение
        Map<Integer, String> map = new HashMap<>(); // в map нет дубликатов ключей

        map.put(1, "One");
        map.put(2, "Two");
        map.put(3, "Three");

        System.out.println(map); // {1=One, 2=Two, 3=Three}

        map.put(3, "Another value for key three");
        System.out.println(map); // {1=One, 2=Two, 3=Another value for key three}

        System.out.println(map.get(0)); // null
        System.out.println(map.get(1)); // One

        for (Map.Entry<Integer, String> entry: map.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}
