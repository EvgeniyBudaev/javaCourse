package javaRushUniversity.javaSyntax.level18.lesson03; // task13.task1308;

import java.util.ArrayList;
import java.util.Collections;

/*
Изучаем методы класса Collections, часть 3
*/

/* В классе Solution объявлены методы: min(ArrayList<Integer>), max(ArrayList<Integer>), frequency(ArrayList<Integer>,
Integer), binarySearch(ArrayList<Integer>, Integer). Тебе нужно разобраться, что делают методы, переписать их
реализацию, используя при этом только соответствующие методы класса Collections. */

public class Solution03 {

    public static Integer min(ArrayList<Integer> list) {
        return Collections.min(list);
//        Integer minimum = list.get(0);
//        for (int i = 1; i < list.size(); i++) {
//            if (list.get(i) < minimum) {
//                minimum = list.get(i);
//            }
//        }
//        return minimum;
    }

    public static Integer max(ArrayList<Integer> list) {
        return Collections.max(list);
//        Integer maximum = list.get(0);
//        for (int i = 1; i < list.size(); i++) {
//            if (list.get(i) > maximum) {
//                maximum = list.get(i);
//            }
//        }
//        return maximum;
    }

    public static int frequency(ArrayList<Integer> list, Integer element) {
        return Collections.frequency(list, element);
//        int frequency = 0;
//        if (element == null) {
//            for (Integer integer : list)
//                if (integer == null)
//                    frequency++;
//        } else {
//            for (Integer integer : list) {
//                if (integer.equals(element)) {
//                    frequency++;
//                }
//            }
//        }
//        return frequency;
    }

    public static int binarySearch(ArrayList<Integer> list, Integer key) {
        Collections.sort(list);
        return Collections.binarySearch(list, key);
//        int low = 0;
//        int high = list.size() - 1;
//        int mid = (low + high) / 2;
//        int index = -1;
//        while (low <= high) {
//            if (list.get(mid) < key) {
//                low = mid + 1;
//            } else if (list.get(mid).equals(key)) {
//                index = mid;
//                break;
//            } else {
//                high = mid - 1;
//            }
//            mid = (low + high) / 2;
//        }
//        return index;
    }
}