package javaRushUniversity.javaSyntax.level18.lesson00; // task13.task1312;

import java.util.ArrayList;
import java.util.HashMap;

/*
ArrayList vs HashMap
*/

/* В классе Solution есть метод getProgrammingLanguages, который возвращает список языков программирования. Тебе нужно
переписать этот метод, чтобы он возвращал HashMap<Integer, String>. Ключом в этой коллекции будет индекс элемента в
ArrayList. */

public class Solution04 {

    public static void main(String[] args) {
        System.out.println(getProgrammingLanguages());
    }

    public static HashMap<Integer, String> getProgrammingLanguages() {
        //напишите тут ваш код
        ArrayList<String> programmingLanguages = new ArrayList<>();
        HashMap<Integer, String> map = new HashMap<>();
        programmingLanguages.add("Java");
        programmingLanguages.add("Kotlin");
        programmingLanguages.add("Go");
        programmingLanguages.add("Javascript");
        programmingLanguages.add("Typescript");
        programmingLanguages.add("Python");
        programmingLanguages.add("PHP");
        programmingLanguages.add("C++");
        for (int i = 0; i < programmingLanguages.size(); i++) {
            map.put(i, programmingLanguages.get(i));
        }
        return map;
    }

}
