package javaRushUniversity.javaSyntax.level13.lesson05.task6; // task10.task1017;

/*
Создание материков
*/

/* Как известно, на планете Земля есть 6 материков. Создай для каждого материка собственный класс. В каждом классе
должно быть поле, которое хранит площадь соответствующего материка. Площадь материка нужно указывать при его создании, и
она должна быть неизменяемой. Ты можешь использовать любые числа для задания площади материков. */

public class Earth {
    public static void main(String[] args) {
        //напишите тут ваш код
        Africa africa = new Africa(1);
        Antarctica antarctica = new Antarctica(2);
        Australia australia = new Australia(3);
        Eurasia eurasia = new Eurasia(4);
        NorthAmerica northAmerica = new NorthAmerica(5);
        SouthAmerica southAmerica = new SouthAmerica(6);
    }
}
