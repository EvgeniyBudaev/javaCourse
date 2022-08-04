package javaRushUniversity.javaSyntax.level21.lesson02.task2; // task14.task1407;

/* Запусти программу и посмотри, что происходит.
В методе eat добавь блок finally, чтобы лев ложился спать, даже если ему не удалось перекусить. */

public class Solution {

    public static void main(String[] args) {
        Lion lion = new Lion();
        lion.eat(new Food("мясо"));
        lion.eat(null);
    }
}
