package yandex.sprint3.task4;

public class BedAndBreakfast { // сделайте класс общедоступным

    // число свободных номеров (10) сохраните в переменную capacity
    private int capacity = 10;

    // сохраните в переменную full значение false - есть номера в наличии
    private boolean full = false;

    public void book() { // метод для бронирования комнат
        if (!full) { // если есть свободные номера
            System.out.println("Забронирован ещё один номер!");
            // уменьшите количество свободных номеров на один
            capacity--;
            printRooms();
            if (capacity == 0) {
                full = true;
            }
        } else {
            System.out.println("Свободных номеров нет!");
        }
    }

    private void printRooms() {
        System.out.println("Свободных номеров - " + capacity);
    }

    public void free() { // метод для освобождения комнат
        if (capacity < 10) { // если свободных комнат меньше 10
            // увеличиваем количество свободных мест на одно
            capacity++;
            System.out.println("Освободился номер!");
            printRooms();
            full = false;
        } else {
            System.out.println("В гостинице только 10 номеров.");
        }
    }

    public boolean isFull() {
        return full;
    }
}
