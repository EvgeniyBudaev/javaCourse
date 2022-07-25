package javaRushUniversity.javaSyntax.level14.lesson00.task2; // task11.task1102;

/*
Земля: техническая характеристика
*/

/* Сделай все переменные класса Planet не статическими. После этого внеси необходимые правки в метод main. */

public class Solution {

    public static void main(String[] args) {
        Planet earth = new Planet();
        earth.name = "Земля";
        earth.age = 4_540_000_000L;
        earth.speed = 170_218;
        earth.area = 510_072_000;
        earth.printInformation();
    }
}
