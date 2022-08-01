package javaRushUniversity.javaSyntax.level20.lesson03;

import java.util.HashMap;
import java.util.HashSet;

public class Test {
    public static void main(String[] args) {
        HashMap<Integer, String> set = new HashMap<>();
        set.put(1, "A");
        set.put(2, "B");
        Day day = Day.values()[0];
        System.out.println(day);
    }
}
