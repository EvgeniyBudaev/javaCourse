package javaRushUniversity.javaSyntax.level13.lesson02.task3; // task10.task1006;

/*
Кто тут наследник?
*/

/* Эта задача нужна для понимания того, как вызывается конструктор базового класса (родителя).
У тебя есть классы ElectricCar, GasCar, HybridCar, которые наследуют класс Car.
Тебе нужно в конструкторах наследников класса Car передать тип автомобиля в конструктор базового класса (родителя), используя super("тип автомобиля"). Для этого в классе Solution в методе main создай 3 объекта: HybridCar, GasCar и ElectricCar.

Вывод должен быть следующий (последовательность может быть любая):
Привет. Я ElectricCar
Привет. Я GasCar
Привет. Я HybridCar
 */

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        ElectricCar electricCar = new ElectricCar();
        GasCar gasCar = new GasCar();
        HybridCar hybridCar = new HybridCar();
    }
}