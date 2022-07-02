package programaniya.Multithreading.CreateThread;

public class Main {
    public static void main(String[] args) {
        MyThread1 myThread1 = new MyThread1();
        Thread myThread2 = new Thread(new MyThread2());

        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Hello");
            }
        }).start();

        new Thread(() -> System.out.println("Hi")).start();

        myThread1.start();
        myThread2.start();
    }
}

class MyThread1 extends Thread {
    public void run() {
        for (int i = 1; i <= 1000; i++) {
            System.out.println(i);
        }
    }
}

class MyThread2 implements Runnable {
    public void run() {
        for (int i = 1000; i > 0; i--) {
            System.out.println(i);
        }
    }
}
