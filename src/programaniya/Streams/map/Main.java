package programaniya.Streams.map;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        /* Методы стрима не меняют исходную коллекцию */
        List<String> list = new ArrayList<>();
        list.add("privet");
        list.add("kak dela");
        list.add("ok");
        list.add("poka");

//        for (int i = 0; i < list.size(); i++) {
//            list.set(i, String.valueOf(list.get(i).length()));
//        }
        List<Integer> listNumbers = list.stream().map(element -> element.length())
                .collect(Collectors.toList());
        System.out.println(listNumbers); // [6, 8, 2, 4]

        int[] array = {5, 9, 3, 8, 1};
        array = Arrays.stream(array).map(element -> {
            if (element % 3 == 0) {
                element = element / 3;
            }
            return element;
        }).toArray();
        System.out.println(Arrays.toString(array)); // [5, 3, 1, 8, 1]

        Set<String> set = new TreeSet<>();
        set.add("privet");
        set.add("kak dela");
        set.add("ok");
        set.add("poka");
        System.out.println(set); // [kak dela, ok, poka, privet]

        Set<Integer> newSet = set.stream().map(e -> e.length()).collect(Collectors.toSet());
        System.out.println(newSet); // [2, 4, 6, 8] в отсортиованном виде
    }
}
