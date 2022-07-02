package programaniya.Multithreading.LockReentrantLock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Main {
    /* Lock - интерфейс, который имплементируется классом ReentrantLock. */
    /* Также как и ключевое слово synchronized, Lock нужен для достижения синхронизации между потоками. */
    public static void main(String[] args) {
        Call call = new Call();
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                call.mobileCall();
            }
        });
        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                call.skypeCall();
            }
        });
        Thread thread3 = new Thread(new Runnable() {
            @Override
            public void run() {
                call.whatsappCall();
            }
        });

        thread1.start();
        thread2.start();
        thread3.start();
    }
}

class Call {
    private Lock lock = new ReentrantLock();

    void mobileCall() {
        lock.lock();
        try {
            System.out.println("Mobile call starts");
            Thread.sleep(3000);
            System.out.println("Mobile call ends");
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } finally {
            lock.unlock();
        }
    }

    void skypeCall() {
        lock.lock();
        try {
            System.out.println("Skype call starts");
            Thread.sleep(5000);
            System.out.println("Skype call ends");
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } finally {
            lock.unlock();
        }
    }

    void whatsappCall() {
        lock.lock();
        try {
            System.out.println("Whatsapp call starts");
            Thread.sleep(7000);
            System.out.println("Whatsapp call ends");
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } finally {
            lock.unlock();
        }
    }
}
