package javaRushUniversity.javaSyntax.level19.lesson02; // task13.task1329;

import java.util.*;

/*
Сломанная база данных
*/

/* При выводе на экран данных из базы данных (в нашей программе это структура TreeMap) выводится много лишнего, т. к. мы
удалили часть данных. Для вывода только актуальной информации нужно использовать крайние значения id из базы.
Для определения этих значений нужно реализовать методы getMinId и getMaxId. */

public class Solution02 {

    public static void main(String[] args) {
        TreeMap<Integer, String> map = new TreeMap<>();

        map.put(5533, "Head First Java");
        map.put(5536, "Java. Руководство для начинающих");
        map.put(5535, "Java для чайников");
        map.put(5540, "Java. Полное руководство");
        map.put(5531, "Java. Библиотека профессионала");
        map.put(5538, "Java. Методы программирования");
        map.put(5532, "Java. Справочник разработчика");
        map.put(5539, "Java SE 9. Базовый курс");
        map.put(5537, "Effective Java");
        map.put(5534, "Философия Java");

        for (int i = getMinId(map); i <= getMaxId(map); i++) {
            System.out.printf("%d %s %n", i, map.get(i));
        }
    }

    public static Integer getMinId(TreeMap<Integer, String> map) {
        //напишите тут ваш код

        return map.firstKey();
    }

    public static Integer getMaxId(TreeMap<Integer, String> map) {
        //напишите тут ваш код

        return map.lastKey();
    }
}
