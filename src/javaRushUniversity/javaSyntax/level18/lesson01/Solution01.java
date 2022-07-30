package javaRushUniversity.javaSyntax.level18.lesson01; // task13.task1324;

import java.util.Random;
import java.util.TreeMap;

/*
Зарплаты и позиции
*/

public class Solution01 {

    public static void main(String[] args) {
        TreeMap<Integer, String> map = new TreeMap<>();

        map.put(0, "Newbie");
        map.put(300, "Trainee");
        map.put(700, "Junior");
        map.put(1000, "Strong Junior");
        map.put(1700, "Middle");
        map.put(2500, "Strong Middle");
        map.put(3500, "Senior");

        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            int salary = random.nextInt(50) * 100;
            String position = getJobTitle(map, salary);
            System.out.printf("Зарплате $%d соответствует позиция %s%n", salary, position);
        }
    }

    public static String getJobTitle(TreeMap<Integer, String> map, Integer salary) {
        //напишите тут ваш код
        return map.get(map.floorKey(salary+1));
    }
}