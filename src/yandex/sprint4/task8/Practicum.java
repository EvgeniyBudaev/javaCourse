package yandex.sprint4.task8;

class Can implements Openable {
    public void open() {
        System.out.println("Чтобы открыть жестяную банку, нужно потянуть кольцо-ключ.");
    }
}

interface Openable {
    void open();
}

public class Practicum {

    public static void main(String[] args) {
        Openable can = new Can();
        can.open();

        Openable window = new Window();
        window.open();
    }
}

class Window implements Openable {
    public void open() {
        System.out.println("Чтобы открыть окно, нужно повернуть ручку.");
    }
}