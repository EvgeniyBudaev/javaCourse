package programaniya.Multithreading.DataRace;

public class Main {
    public static void main(String[] args) {
        /* Data race - гонка */
        /* Data race - это проблема, которая может возникнуть когда два и более потоков обращаются к однойи той же
         переменной и как минимум 1 поток её изменяет. */
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
    public void increment() {
        Counter.count++;
        System.out.print(Counter.count + " "); // 2 3 5 6 2 4 7 9 8
    }

    @Override
    public void run() {
        for (int i = 0; i < 3; i++) {
            increment();
        }
    }
}
