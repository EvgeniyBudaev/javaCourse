package javaRushUniversity.javaSyntax.level14.lesson00.task3; // task11.task1103;

/*
Презентация роботов
*/

/* В методе main создается 5 роботов и выводится информация о них.
Убери максимально возможное количество модификаторов static так, чтобы функционал программы не изменился.
В методе main менять ничего не нужно. */

public class Solution {
    public static void main(String[] args) {
        System.out.println("Презентация роботов произведенных компанией " + Robot.vendor);

        Robot robot1 = new Robot("RCV-322", 2019);
        robot1.displayInformation();

        Robot robot2 = new Robot("JavaTron-008", 2017);
        robot2.displayInformation();

        Robot robot3 = new Robot("BugDestroyer-007", 1998);
        robot3.displayInformation();

        Robot robot4 = new Robot("Gundam-14", 2004);
        robot4.displayInformation();

        Robot robot5 = new Robot("Eve-2", 2012);
        robot5.displayInformation();
    }
}
