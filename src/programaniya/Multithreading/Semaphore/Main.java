package programaniya.Multithreading.Semaphore;

import java.util.concurrent.Semaphore;

public class Main {
    /* Semaphore - это синхронизатор, позволяющий ограничть доступ к какому-то ресурсу. В конструктор Semaphore нужно
     передавать количество потоков, которым Semaphore будет разрешать одновременно использовать этот ресурс. */

    public static void main(String[] args) {
        Semaphore callBox = new Semaphore(2);

        new Person("Elena", callBox);
        new Person("Bob", callBox);
        new Person("Mike", callBox);
        new Person("Olga", callBox);
    }
}

class Person extends Thread {
    String name;
    private Semaphore callBox;

    public Person(String name, Semaphore callBox) {
        this.name = name;
        this.callBox = callBox;
        this.start();
    }

    public void run() {
        try {
            System.out.println(name + " ждет...");
            /* acquire - предназначен для попытки получить разрешение от семафора. Метод acquire заблокирует этот поток
            * пока ресур не будет доступен для нас. После доступности мы получаем разрешение использовать этот общий
            *  ресурс. */
            callBox.acquire();
            System.out.println(name + " пользуется телефоном"); // получили разрешение
            sleep(2000);
            System.out.println(name + " завершил звонок");
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } finally {
            callBox.release(); // release - освобождаем разрешение семафора
        }
    }
}
