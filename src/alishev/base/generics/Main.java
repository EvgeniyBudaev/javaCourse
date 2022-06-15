package alishev.base.generics;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> animals = new ArrayList<>();
        animals.add("Cat");
        animals.add("Dog");
        animals.add("Frog");

        String cat = animals.get(0);
        System.out.println(cat);
    }
}
