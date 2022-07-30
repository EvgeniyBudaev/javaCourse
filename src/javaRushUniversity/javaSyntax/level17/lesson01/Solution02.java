package javaRushUniversity.javaSyntax.level17.lesson01; // task13.task1302;

import java.util.Arrays;
import java.util.HashSet;

import static java.util.Arrays.asList;

/*
Проверка присутствия
*/

/* В классе Solution есть метод checkWords(String), который должен проверять наличие переданного слова в множестве
words. Если слово есть, то выводим в консоль: Слово [переданное слово] есть в множестве
Если нет: Слова [переданное слово] нет в множестве */

public class Solution02 {
    public static HashSet<String> words = new HashSet<>(asList("Если бы меня попросили выбрать язык на замену Java я бы не выбирал".split(" ")));

    public static void checkWords(String word) {
        //напишите тут ваш код
        if (words.contains(word)) {
            System.out.println("Слово " + word + " есть в множестве");
        } else {
            System.out.println("Слова " + word + " нет в множестве");
        }
    }

    public static void main(String[] args) {
        checkWords("JavaScript");
        checkWords("Java");
    }
}
