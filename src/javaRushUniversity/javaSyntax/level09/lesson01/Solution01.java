package javaRushUniversity.javaSyntax.level09.lesson01; // task06.task0603;

/*
Любимое блюдо
*/

/* Переименуй параметры метода printPersonInfo():

    firstName в name;
    lastName в surname;
    favouriteDish в meal;

таким образом, чтобы функционал программы остался неизменным.
Имена переменных в методе main() оставь без изменений. */

public class Solution01 {
    public static void main(String[] args) {
        String firstName = "Ольга";
        String lastName = "Киприяновна";
        String favouriteDish = "Пельмени";
        printPersonInfo(firstName, lastName, favouriteDish);
    }

    public static void printPersonInfo(String name, String surname, String meal){
        System.out.println("Краткое досье:");
        System.out.println("Имя: " + name);
        System.out.println("Фамилия: " + surname);
        System.out.println("Любимое блюдо: " + meal);
    }
}
