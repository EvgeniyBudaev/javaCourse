package programaniya.Multithreading.DeadlockLivelockStarvation;

public class Main {
    /* Deadlock - ситуация, когда два и более потоков залочены навсегда, ожидают друг друга и ничего не делают. */
    /* Livelock - ситуация, когда два и более потоков залочены навсегда, ожидают друг друга, проделывают какую-то
     работу, но без какого-либо прогресса. */
    /* Lock starvation - ситуация, когда менее приоритетные потоки ждут долгое время или всё время для того, чтобы
     могли запуститься. */
    public static final Object lock1 = new Object();
    public static final Object lock2 = new Object();

    public static void main(String[] args) {
        Thread1 thread1 = new Thread1();
        Thread2 thread2 = new Thread2();
        thread1.start();
        thread2.start();
    }
}

class Thread1 extends Thread {
    public void run() {
        System.out.println("Thread1: Попытка захватить монитор объекта lock1");
        synchronized (Main.lock1) {
            System.out.println("Thread1: Монитор объекта lock 1 захвачен");
            System.out.println("Thread1: Попытка захватить монитор объекта lock2");
            synchronized (Main.lock2) {
                System.out.println("Thread1: Мониторы объектов lock 1 и lock2 захвачены");
            }
        }
    }
}

class Thread2 extends Thread {
    public void run() {
        System.out.println("Thread2: Попытка захватить монитор объекта lock1");
        synchronized (Main.lock1) {
            System.out.println("Thread2: Монитор объекта lock 1 захвачен");
            System.out.println("Thread2: Попытка захватить монитор объекта lock2");
            synchronized (Main.lock2) {
                System.out.println("Thread2: Мониторы объектов lock 1 и lock2 захвачены");
            }
        }
    }
}
