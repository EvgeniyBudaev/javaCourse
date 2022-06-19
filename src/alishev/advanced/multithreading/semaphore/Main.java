package alishev.advanced.multithreading.semaphore;

import java.util.concurrent.Semaphore;

// Semaphore. Когда много потоков используют ресурс. И мы используем Semaphore, чтобы ограничить доступ к этому ресурсу.
public class Main {
    public static void main(String[] args) {
        // в конструктор передаем кол-во разрешений для потоков
        // Максимум 3 потока используют какой-то ресурс
        Semaphore semaphore = new Semaphore(3);
        try {
            semaphore.acquire(); // acquire когда мы в потоке начинаем взаимодействие с ресурсом
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        semaphore.release(); // release - отдает разрешение
        System.out.println(semaphore.availablePermits()); // availablePermits возвращает кол-во свободных разрешений
    }
}
