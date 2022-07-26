package javaRushUniversity.javaSyntax.level16.lesson01; // task12.task1204;

/*
Плата по счетам
*/

/* В классе Solution есть поле balance, которое описывает баланс средств на банковском счете. При объявлении
проинициализируй его значением Integer.MAX_VALUE. Реализуй метод processPayment(String), который принимает чек и
производит списание средств со счета соответственно чеку. Метод main не принимает участие в проверке. */

public class Solution01 {
    public static Integer balance = Integer.MAX_VALUE;

    public static void main(String[] args) {
        String bill = "1234567890";

        System.out.println("Текущий баланс : " + balance);
        processPayment(bill);
        System.out.println("Текущий баланс : " + balance);
    }

    public static void processPayment(String bill) {
        //напишите тут ваш код
        balance -= Integer.parseInt(bill);
    }
}