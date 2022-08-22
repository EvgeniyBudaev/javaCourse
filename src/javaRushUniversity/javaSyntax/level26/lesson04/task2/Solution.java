package javaRushUniversity.javaSyntax.level26.lesson04.task2; // com.javarush.task.pro.task15.task1539;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;

/*
Использование Paths 2
*/

public class Solution {

    public static void main(String[] args) {
        System.out.println(joinToPath(Arrays.asList("d:/", "study/", "javarush/", "полезные куски кода.txt")));
    }

    public static Path joinToPath(List<String> partsList) {
        //напишите тут ваш код
        String[] list = new String[partsList.size() - 1];
        System.arraycopy (partsList.toArray(list), 1, list, 0, list.length);
        Path path = Paths.get(partsList.get(0), list);
        return path;
    }

}
