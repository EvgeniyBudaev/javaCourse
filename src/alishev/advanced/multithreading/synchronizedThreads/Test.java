package alishev.advanced.multithreading.synchronizedThreads;

public class Test {
    private int counter;

    public static void main(String[] args) throws InterruptedException {
        Test test = new Test();
        test.doWork();
    }

    /* synchronized - всё что находится в теле метода может выполнять только один поток в данный момент времени */
    public synchronized void increment() {
        counter++;
    }
//    public void increment() {
//        synchronized (this) {
//            counter++;
//        }
//    }

    public void doWork() throws InterruptedException {
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10000; i++) {
                    increment();
                }
            }
        });

        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10000; i++) {
                    increment();
                }
            }
        });

        thread1.start();
        thread2.start();

        // join - ждем завершение работы потока
        thread1.join();
        thread2.join();

        System.out.println(counter);
    }
}
