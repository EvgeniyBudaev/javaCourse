package javaRushUniversity.javaSyntax.level16.lesson04; // task12.task1214;

import java.util.ArrayList;
import java.util.Arrays;

/*
Прощай, Паскаль
*/

/* В методе main найди и удали язык программирования Pascal из списка programmingLanguages. */

public class Solution02 {
    public static ArrayList<String> programmingLanguages = new ArrayList<>(Arrays.asList("C", "C++", "Python", "JavaScript", "Ruby", "Java", "Pascal"));

    public static void main(String[] args) {
        //напишите тут ваш код
        programmingLanguages.remove("Pascal");
    }
}
