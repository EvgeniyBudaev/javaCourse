package javaRushUniversity.javaSyntax.level14.lesson01.task2; // task11.task1105;

/*
Оконные работы
*/

/* В классе Window есть метод changeSize, который должен менять размеры окна на значения, переданные в метод. Но если ты
запустишь программу, то убедишься, что этот метод не работает. Тебе нужно исправить ошибки так, чтобы метод заработал.*/

public class Solution {
    public static void main(String[] args) {
        Window window = new Window();
        window.printSize();
        window.changeSize(4, 5);
        window.printSize();
    }
}
