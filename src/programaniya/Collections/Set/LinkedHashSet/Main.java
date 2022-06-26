package programaniya.Collections.Set.LinkedHashSet;

import java.util.LinkedHashSet;

public class Main {
    public static void main(String[] args) {
        /* LinkedHashSet является наследником HashSet.
        * Хранит информацию о порядке добавления элементов.
        * Производительность методов немного ниже, чем у методов HashSet.
        * В основе LinkedHashSet лежит HashMap. У элементов данного HashMap:
        * ключи - это элементы LinkedHashSet, значения - это константа-заглушка. */
        LinkedHashSet<Integer> lhs = new LinkedHashSet<>();
        lhs.add(5);
        lhs.add(1);
        lhs.add(8);
        lhs.add(10);
        System.out.println(lhs); // [5, 1, 8, 10]
        System.out.println(lhs.contains(8)); // true

        lhs.remove(8);
    }
}
