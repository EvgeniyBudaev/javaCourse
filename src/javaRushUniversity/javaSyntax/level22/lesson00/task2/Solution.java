package javaRushUniversity.javaSyntax.level22.lesson00.task2; // com.javarush.task.pro.task14.task1418;

/*
Собственное исключение
*/

import java.util.ArrayList;

public class Solution {
    public static String message = "Похоже, что у объекта класса Human не инициализирован список детей.";

    public static void main(String[] args) {
        Human amigo = new Human("Amigo", 25, new ArrayList<>());
        System.out.printf("Имя: %s, возраст: %d, количество детей: %d%n", amigo.getName(), amigo.getAge(), getChildrenCount(amigo));

        Human diego = new Human("Diego", 35);
        System.out.printf("Имя: %s, возраст: %d, количество детей: %d%n", diego.getName(), diego.getAge(), getChildrenCount(diego));
    }

    public static int getChildrenCount(Human human) {
        int size;
        //напишите тут ваш код
        try {
            size = human.getChildren().size();
            return size;
        } catch (NullPointerException e) {
            throw new ChildrenNotInitializedException(message);
        }

    }
}