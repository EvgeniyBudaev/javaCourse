package javaRushUniversity.javaSyntax.level13.lesson01.task1; // task10.task1001;

/*
Создадим небоскреб
*/

/* Попробуем сконструировать свой первый небоскреб и объявить о результате выполнения в консоли. Для этого тебе нужно
вызвать конструктор класса Skyscraper в методе main и в теле конструктора вывести в консоль
текст "Небоскреб построен.". */

public class Skyscraper {

    //напишите тут ваш код
    public Skyscraper() {
        System.out.println("Небоскреб построен.");
    }

    public static void main(String[] args) {
        //напишите тут ваш код
        Skyscraper skyscraper = new Skyscraper();
    }
}