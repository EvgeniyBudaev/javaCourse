package programaniya.Multithreading.SleepJoinThreadStates;

public class Main extends Thread {
    @Override
    public void run() {
        for (int i = 5; i > 0; i--) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println(Thread.currentThread().getName() + " " + i);
        }
    }

    public static void main(String[] args) throws InterruptedException {
        Thread thread1 = new Thread(new MyRunnable());
        Main thread2 = new Main();

        System.out.println(thread1.getState()); // NEW
        thread1.start();
        System.out.println(thread1.getState()); // RUNNABLE
        thread2.start();

        thread1.join(); // join - main будет ожидать завершение работы потока
        System.out.println(thread1.getState()); // TERMINATED
        thread2.join(1000);

        System.out.println("The end");

        // Thread States: New -> Runnable -> Terminated
        //                       /       \
        //                     ready      running
    }
}

class MyRunnable implements Runnable {
    @Override
    public void run() {
        for (int i = 5; i > 0; i--) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println(Thread.currentThread().getName() + " " + i);
        }
    }
}
