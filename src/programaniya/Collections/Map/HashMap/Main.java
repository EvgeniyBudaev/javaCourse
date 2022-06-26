package programaniya.Collections.Map.HashMap;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<Integer, String> map1 = new HashMap<>();
        map1.put(100, "Zaur Tregulov");
        map1.put(300, "Ivan Ivanov");
        map1.put(200, "Petr Petrov");
        System.out.println(map1); // {100=Zaur Tregulov, 200=Petr Petrov, 300=Ivan Ivanov}
        map1.putIfAbsent(400, "Sidr Sidorov"); // putIfAbsent - добавляет элемент, если ключа такого нет
        System.out.println(map1.get(100)); // Zaur Tregulov
        System.out.println(map1.containsValue("Zaur Tregulov")); // true
        System.out.println(map1.containsKey(100)); // true
        System.out.println(map1.keySet()); // [400, 100, 200, 300]
        System.out.println(map1.values()); // [Sidr Sidorov, Zaur Tregulov, Petr Petrov, Ivan Ivanov]
        map1.remove(200);
    }
}
