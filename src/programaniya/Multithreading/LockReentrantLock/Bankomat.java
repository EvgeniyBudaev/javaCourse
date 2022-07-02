package programaniya.Multithreading.LockReentrantLock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Bankomat {
    public static void main(String[] args) throws InterruptedException {
        Lock lock = new ReentrantLock();
        new Employee("Bob", lock);
        new Employee("Elena", lock);
        new Employee("Mike", lock);
        Thread.sleep(5000);
        new Employee("Marina", lock);
        new Employee("Victor", lock);
    }
}

class Employee extends Thread {
    String name;
    private Lock lock;

    public Employee(String name, Lock lock) {
        this.name = name;
        this.lock = lock;
        this.start();
    }

    public void run() {
//        try {
//            System.out.println(name + " ждет.");
//            lock.lock();
//            System.out.println(name + " пользуется банкоматом");
//            Thread.sleep(2000);
//            System.out.println(name + " завершил дела");
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        } finally {
//            lock.unlock();
//        }
//    }
        if (lock.tryLock()) {
            try {
                System.out.println(name + " пользуется банкоматом");
                Thread.sleep(2000);
                System.out.println(name + " завершил дела");
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            } finally {
                lock.unlock();
            }
        } else {
            System.out.println(name + " не хочет ждать в очереди");
        }
    }
}
