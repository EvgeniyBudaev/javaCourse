package javaRushUniversity.javaSyntax.level13.lesson02.task2; // task10.task1005;

/*
Многосерийный предприниматель
*/

/* Постройка здания планировалась под ресторан и успешно завершилась, но спустя некоторое время собственники решили
переделать его под барбершоп. Нам нужно сделать так, что бы здание было универсальным, и его назначение можно было
менять, не создавая нового. Для этого создай метод initialize, который будет устанавливать значение полю type
(определять тип здания), а конструктор убери. */

public class Building {
    private String type;

    //напишите тут ваш код
    public void initialize(String type) {
        this.type = type;
    }

    public static void main(String[] args) {
        Building building = new Building();
        building.initialize("Барбершоп");
    }
}
