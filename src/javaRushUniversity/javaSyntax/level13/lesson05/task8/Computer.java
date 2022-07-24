package javaRushUniversity.javaSyntax.level13.lesson05.task8; // task10.task1020;

/* Собираем компьютер

Попробуем собрать компьютер. У нас есть классы: системный блок, монитор, клавиатура, мышь. В классе компьютер в
конструкторе создай объекты классов-составляющих компьютера. */

public class Computer {
    public Computer() {
        new Keyboard();
        new SystemUnit();
        new Mouse();
        new Monitor();
    }
}
