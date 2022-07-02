package programaniya.Multithreading.ScheduledExecutorService;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class Main {
    /* ScheduledExecutorService мы используем тогда, когда хотим установить расписание назапуск потоков из пула.
    * Данный pool создается, используя factory метод класса Executors:
    * Executors.newScheduledThreadPool(int count) */

    public static void main(String[] args) throws InterruptedException {
        ScheduledExecutorService scheduledExecutorService = Executors.newScheduledThreadPool(1);

//        for (int i = 0; i < 10; i++) {
//            scheduledExecutorService.execute(new RunnableImp());
//        }

//        scheduledExecutorService.schedule(new RunnableImp(), 3, TimeUnit.SECONDS);
//        scheduledExecutorService.scheduleAtFixedRate(new RunnableImp(), 3, 1, TimeUnit.SECONDS);
        scheduledExecutorService.scheduleWithFixedDelay(new RunnableImp(), 3, 1, TimeUnit.SECONDS);

        Thread.sleep(20000);
        scheduledExecutorService.shutdown();

        ExecutorService executorService = Executors.newCachedThreadPool();
    }
}

class RunnableImp implements Runnable {
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + " begins work");
//        try {
//            Thread.sleep(5000);
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }
        System.out.println(Thread.currentThread().getName() + " ends work");
    }
}
