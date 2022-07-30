package javaRushUniversity.javaSyntax.level17.lesson01; // task13.task1301;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;

/*
Оформляем возврат
*/

/* В классе Solution есть метод arrayToHashSet(String[]), который должен из переданного массива вернуть HashSet<String>
с теми же элементами. Метод main не участвует в проверке. */

public class Solution01 {
    public static void main(String[] args) {
        String[] array = {"Через", "три", "года", "я", "буду", "Senior", "Java", "Developer"};
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
        System.out.println("___________________________________");

        HashSet<String> hashSet = arrayToHashSet(array);
        for(String s : hashSet) {
            System.out.println(s);
        }
    }

    public static HashSet<String> arrayToHashSet(String[] strings) {
        //напишите тут ваш код
        return new HashSet<>(Arrays.asList(strings));
    }
}