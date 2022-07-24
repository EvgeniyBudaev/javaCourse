package javaRushUniversity.javaSyntax.level13.lesson05.task9; // task10.task1021;

/*
Автопроизводитель
*/

/* Давай создадим каталог новых моделей авто у нас на производстве. Для этого нам нужно создать один метод initialize,
который будет инициализировать такие поля объекта типа Car: модель, год выпуска, цвет. */

public class Car {
    private String model;
    private int year;
    private String color;

    //напишите тут ваш код
    public void initialize(String model, int year, String color) {
        this.model = model;
        this.year = year;
        this.color = color;
    }
}