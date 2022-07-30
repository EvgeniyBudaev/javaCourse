package javaRushUniversity.javaSyntax.level17.lesson01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

import static java.util.Arrays.asList;

/*
Преобразование списка во множество
*/

/* Реализуй метод listToSet(ArrayList<String>), который преобразует список строк во множество. */

public class Solution03 {

    public static void main(String[] args) {
        ArrayList<String> listOfWords = new ArrayList<>(asList(
                "В свет вышла новая серия книг по программированию на Java: \"Java для начинающих\", \"Java для продолжающих\", \"Java для заканчивающих\""
                        .split(" ")));
        System.out.println("Количество слов в списке: " + listOfWords.size());
        HashSet<String> setOfWords = listToSet(listOfWords);
        System.out.println("Количество слов во множестве: " + setOfWords.size());
    }

    public static HashSet<String> listToSet(ArrayList<String> listOfWords) {
        HashSet<String> result = new HashSet<>();
        //напишите тут ваш код
        return new HashSet<>(listOfWords);
    }
}