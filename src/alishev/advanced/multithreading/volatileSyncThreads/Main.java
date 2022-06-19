package alishev.advanced.multithreading.volatileSyncThreads;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        myThread.start();

        Scanner scanner = new Scanner(System.in);
        scanner.nextLine();

        myThread.shutdown();
    }
}

class MyThread extends Thread {
    /*
    volatile гарантирует когерентность кешей ядер процессора.
    volatile - переменная не будет кешироваться для каждого ядра.
    Когда один поток записывает в переменную,а другой поток читает из переменной обязательно нужно использовать
    ключевое слово volatile, чтобыобеспечить когерентность кешей, чтобы у разных потоков была одна и таже версия
    переменной, которую они оба используют.
     */
    private volatile boolean running = true; // volatile - переменная будет находится в Main Memory

    public void run() {
        while (running) {
            System.out.println("Hello");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public void shutdown() {
        this.running = false;
    }
}
