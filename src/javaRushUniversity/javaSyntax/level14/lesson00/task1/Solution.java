package javaRushUniversity.javaSyntax.level14.lesson00.task1; // task11.task1101;

/*
Солнечная система — наш дом
*/

/* Программа выводит на экран основные факты о Солнечной системе.
Перепиши код так, чтобы в выводе использовались все переменные класса SolarSystem, но результат работы программы при
этом не изменился. */

public class Solution {
    public static void main(String[] args) {
        System.out.println("Человечество живет в Солнечной системе.");
        System.out.println("Ее возраст около " + SolarSystem.age + "  лет.");
        System.out.println("В Солнечной системе " + SolarSystem.planetsCount + " известных планет.");
        System.out.println("Как и большинство звездных систем, состоит из " + SolarSystem.starsCount + " звезды.");
        System.out.println("Звезды по имени " + SolarSystem.starName + ".");
        System.out.println("Расстояние к центру галактики составляет "
                + SolarSystem.galacticCenterDistance + " световых лет.");
        System.out.println("Каждый обитатель Солнечной системы должен знать эту информацию!");
    }
}
