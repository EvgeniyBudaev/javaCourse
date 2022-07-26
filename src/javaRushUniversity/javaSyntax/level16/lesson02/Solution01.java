package javaRushUniversity.javaSyntax.level16.lesson02; // task12.task1209;

import java.util.ArrayList;

/*
Бухгалтерия
*/

/* В классе Solution есть список сотрудников waitingEmployees, которые ждут зарплату, и список сотрудников
alreadyGotSalaryEmployees, которые её уже получили. Необходимо реализовать метод paySalary(String), который в качестве
аргумента принимает имя сотрудника, желающего получить зарплату. Метод должен проверить наличие сотрудника в списке
waitingEmployees, и если он не получал зарплату, выдать её:

    Если параметр метода paySalary(String) равняется null, ничего не нужно делать.
    Добавить имя сотрудника в список alreadyGotSalaryEmployees.
    В списке waitingEmployees заменить имя сотрудника на null.

 */

public class Solution01 {
    public static ArrayList<String> waitingEmployees = new ArrayList<>();
    public static ArrayList<String> alreadyGotSalaryEmployees = new ArrayList<>();

    public static void initEmployees() {
        waitingEmployees.add("Гвинно");
        waitingEmployees.add("Гунигерд");
        waitingEmployees.add("Боргелейф");
        waitingEmployees.add("Нифрод");
        waitingEmployees.add("Альбиуф");
        waitingEmployees.add("Иногрим");
        waitingEmployees.add("Фриле");
    }

    public static void main(String[] args) {
        initEmployees();
    }

    public static void paySalary(String name) {
        //напишите тут ваш код
        if (name == null) {
            return;
        }

        if (waitingEmployees.contains(name)) {
            int index = waitingEmployees.indexOf(name);
            waitingEmployees.set(index, null);
            alreadyGotSalaryEmployees.add(name);
        }
    }
}
