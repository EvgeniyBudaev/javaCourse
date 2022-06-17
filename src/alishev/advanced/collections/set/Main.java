package alishev.advanced.collections.set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        // Set - коллекция, которая хранит только уникальные значения
        Set<String> hashSet = new HashSet<>(); // HashSet не гарантирует порядок элементов
        Set<String> linkedHashSet = new LinkedHashSet<>(); // LinkedHashSet сохраняет порядок добавления элементов
        Set<String> treeSet = new TreeSet<>(); // TreeSet сортирует порядок

        hashSet.add("Mike");
        hashSet.add("Mike");
        hashSet.add("Bob");
        hashSet.add("Geogre");
        hashSet.add("Donald");

        linkedHashSet.add("Mike");
        linkedHashSet.add("Mike");
        linkedHashSet.add("Bob");
        linkedHashSet.add("Geogre");
        linkedHashSet.add("Donald");

        treeSet.add("Mike");
        treeSet.add("Mike");
        treeSet.add("Bob");
        treeSet.add("Geogre");
        treeSet.add("Donald");

        System.out.println(hashSet); // [Mike, Geogre, Bob, Donald]

        System.out.println("-------- HashSet ------------");
        for (String name: hashSet) {
            System.out.println(name); // Mike, Geogre, Bob, Donald
        }
        System.out.println("-------- LinkedHashSet ------------");
        for (String name: linkedHashSet) {
            System.out.println(name); // Mike, Bob, Geogre, Donald
        }
        System.out.println("-------- TreeSet ------------");
        for (String name: treeSet) {
            System.out.println(name); // Bob, Donald, Geogre, Mike
        }

        System.out.println("-------- contains ------------");
        // contains в сетах очень быстро работает из-за хеширования. O(1)
        System.out.println(hashSet.contains("Bob")); // true // contains - проверяет на наличие элемента

        System.out.println("-------- isEmpty ------------");
        System.out.println(hashSet.isEmpty()); // false, т.к. наш сет не пустой

        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();

        set1.add(0);
        set1.add(1);
        set1.add(2);
        set1.add(3);
        set1.add(4);
        set1.add(5);

        set2.add(2);
        set2.add(3);
        set2.add(4);
        set2.add(5);
        set2.add(6);
        set2.add(7);

        System.out.println("-------- Пересечение a.intersect(b) ------------");
        Set<Integer> intersection = new HashSet<>(set1);
        intersection.retainAll(set2); // [2, 3, 4, 5]
        System.out.println(intersection);
        System.out.println("-------- Объединение a.union(b) ------------");
        Set<Integer> union = new HashSet<>(set1);
        union.addAll(set2); // [0, 1, 2, 3, 4, 5, 6, 7]
        System.out.println(union);
        System.out.println("-------- Разность a.subtract(b) ------------");
        Set<Integer> difference = new HashSet<>(set1);
        difference.removeAll(set2);
        System.out.println(difference); // [0, 1]
        System.out.println("-------- Симметрическая разность a.exclusiveOr(b) ------------");
    }
}
