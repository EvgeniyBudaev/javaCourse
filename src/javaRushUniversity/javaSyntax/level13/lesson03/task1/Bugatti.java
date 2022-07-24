package javaRushUniversity.javaSyntax.level13.lesson03.task1; // task10.task1007;

/*
С крышей или без? Вот в чем вопрос
*/

/* Ты сделал предзаказ на новенькую Bugatti ровно полгода назад. Сейчас июнь, и было бы неплохо все-таки ездить на
кабриолете. Но ты забыл, в каком кузове заказывал машину. Твоя задача — добавить функциональность для получения текущей
конфигурации и изменения её при необходимости. Для этого создай геттеры и сеттеры. */

public class Bugatti {
    private String color = "BLACK";
    private int year = 2020;
    private String body = "Coupe";

    //напишите тут ваш код
    public Bugatti() {}

    public String getBody() {
        return this.body;
    }

    public void setBody(String body) {
        this.body = body;
    }
}
