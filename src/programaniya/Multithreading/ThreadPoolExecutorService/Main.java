package programaniya.Multithreading.ThreadPoolExecutorService;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;


public class Main {
    /* Thread pool - это множество потоков, каждыйиз которых предназначен для выполнения той или иной задачи. */
    /* Thread pool удобнее всего создавать, используя factory методы класса Executors:
    * Executors.newFixedThreadPool(int count) - создаст pool с 5-ю потоками;
    * Executors.newSingleThreadExecutor() - создаст pool содним потоком. */
    /* Метод execute передаёт наше задание (task) в thread pool, где оно выполняется одним из потоков. */
    /* После выполнения метода shutdown ExecutorService понимает, что новых заданийбольше не будет и, выполнив
     поступившие до этого задания, прекращает работу. */
    /* Метод awaitTermination принуждает поток в котором он вызвался подождать до тех пор, пока не выполнится одно из
     двух событий: либо ExecutorService прекратит свою работу, либо пройдет время, указанное в параметре метода
      awaitTermination. */

    public static void main(String[] args) throws InterruptedException {
        ExecutorService executorService = Executors.newFixedThreadPool(5);
        for (int i = 0; i < 10; i++) {
            executorService.execute(new RunnableImp());
        }
        executorService.shutdown(); // завершить
        executorService.awaitTermination(5, TimeUnit.SECONDS);
        System.out.println("Main ends");
    }
}

class RunnableImp implements Runnable {
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
