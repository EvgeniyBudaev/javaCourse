package programaniya.Multithreading.SynchronizedMethods;

public class Main {
    /* Техника, когда потоки хотят менять значение переменной */
    /* Ключевое слово synchronized - в одно и тоже время с методом может работать только один поток. */
    volatile static int counter = 0;
    public static synchronized void increment() {
        counter++;
    }

    public static void main(String[] args) throws InterruptedException {
        Thread thread1 = new Thread(new R());
        Thread thread2 = new Thread(new R());
        thread1.start();
        thread2.start();
        thread1.join();
        thread2.join();

        System.out.println(counter);
    }
}

class R implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            Main.increment();
        }
    }
}
