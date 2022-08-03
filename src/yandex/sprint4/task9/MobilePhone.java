package yandex.sprint4.task9;

public class MobilePhone extends Phone {
    public MobilePhone(String number) {
        super(number);
    }

    public final void sendSms(String targetNumber, String messageText) {
        System.out.println("Отправляем сообщение " + messageText + " по номеру " + targetNumber);
    }
}