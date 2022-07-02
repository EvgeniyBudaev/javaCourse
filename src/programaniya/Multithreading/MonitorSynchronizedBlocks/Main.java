package programaniya.Multithreading.MonitorSynchronizedBlocks;

public class Main {
    /* Монитор - это сущность / механизм, благодаря которому достигается корректная работа при синхронизации.
    * В Java у каждого класса и объекта есть привязанный к нему монитор. */
    public static void main(String[] args) {
        MyRunnableImp1 runnable = new MyRunnableImp1();
        Thread thread1 = new Thread(runnable);
        Thread thread2 = new Thread(runnable);
        Thread thread3 = new Thread(runnable);
        thread1.start();
        thread2.start();
        thread3.start();
    }
}

class Counter {
    volatile static int count = 0;
}

class MyRunnableImp1 implements Runnable {
    private void doWork1() {
        synchronized (this) {
            Counter.count++;
            System.out.println(Counter.count);
        }
    }

    @Override
    public void run() {
        for (int i = 0; i < 3; i++) {
            doWork1();
        }
    }
}
