package programaniya.Multithreading.AtomicInteger;

import java.util.concurrent.atomic.AtomicInteger;

public class Main {
    /* AtomicInteger - это класс, который предоставляет возможность работать с целочисленным значением int, используя
     атомарные операции. */

    // static int counter = 0;
    static AtomicInteger counter = new AtomicInteger();


//    public synchronized static void increment() {
    public static void increment() {
        // counter++;
        counter.incrementAndGet();
//        counter.addAndGet(5);
    }

    public static void main(String[] args) throws InterruptedException {
        Thread thread1 = new Thread(new MyRunnableImp());
        Thread thread2 = new Thread(new MyRunnableImp());
        thread1.start();
        thread2.start();
        thread1.join();
        thread2.join();

        System.out.println(counter);
    }
}

class MyRunnableImp implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            Main.increment();
        }
    }
}
