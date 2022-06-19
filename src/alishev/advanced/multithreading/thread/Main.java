package alishev.advanced.multithreading.thread;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        // Первый вариант
        Thread thread = new Thread(new Runner());
        thread.start();

        // Второй вариант
        MyThread myThread1 = new MyThread();
        myThread1.start(); // start - создает новый поток, берет метод run и запускает код в новом потоке

        MyThread myThread2 = new MyThread();
        myThread2.start();

        System.out.println("Main thread");

        System.out.println("I am going to sleep");
        Thread.sleep(3000);
        System.out.println("I am awake!");
    }
}

// Первый вариант
class Runner implements Runnable {
    @Override
    public void run() {
        for (int i= 0; i < 1000; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("Hello from MyThread" + i);
        }
    }
}

// Второй вариант
class MyThread extends Thread {
    public void run() {
        for (int i= 0; i < 1000; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("Hello from MyThread" + i);
        }
    }
}
