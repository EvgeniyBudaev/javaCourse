package programaniya.Collections.Set.HashSet;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        /* Set - коллекция, хранящая  уникальные элементы.
        * Методы данной коллекции очень быстры.
        * HashSet не запоминает порядок добавления элементов.
        * В основе HashSet лежит HashMap. У элементов данного HashMap:
        * ключи = это элементы HashSet, значения - это константа-гаглушка. */
        Set<String> set = new HashSet<>();
        set.add("A");
        set.add("A");
        set.add("B");
        set.add("C");
        System.out.println(set); // [A, B, C]
        System.out.println(set.size()); // 3
        System.out.println(set.isEmpty()); // false
        System.out.println(set.contains("C")); // true
        Set<String> set2 = new HashSet<>();
        set2.add("F");
        set2.add("G");
        set2.add("A");

        HashSet<String> union = new HashSet<>(set);
        union.addAll(set2);
        System.out.println(union); // [A, B, C, F, G]

        HashSet<String> intersect = new HashSet<>(set);
        intersect.retainAll(set2);
        System.out.println(intersect); // [A]

        HashSet<String> subtract = new HashSet<>(set);
        subtract.removeAll(set2);
        System.out.println(subtract); // [B, C]

        set.remove("B");
    }
}
