package alishev.advanced.multithreading.callableFuture;

import java.util.Random;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

// Callable - возвращает значение из потоков, а также позволяет выбрасывать исключение из потоков
// Future - получить доступ к возвращаемому значению
public class Main {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(1);
        Future<Integer> future = executorService.submit(() -> {
            System.out.println("Starting");
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("Finished");

            Random random = new Random();
            int randomValue = random.nextInt();
            if (randomValue < 5) {
                throw new Exception("Something bad happened");
            }
            return random.nextInt(10);
        });

        // Тоже самое что и через лямбду выражение. Java сама понимает.
//        executorService.submit(new Callable<Integer>() {
//            @Override
//            public Integer call() throws Exception {
//                System.out.println("Starting");
//                try {
//                    Thread.sleep(3000);
//                } catch (InterruptedException e) {
//                    throw new RuntimeException(e);
//                }
//                System.out.println("Finished");
//
//                return 5;
//            }
//        });
        
        executorService.shutdown();

        try {
            int result = future.get(); // get дожидается окончания выполнения потока
            System.out.println(result);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } catch (ExecutionException e) {
            Throwable ex = e.getCause(); // getCause - получить причину исключения
            System.out.println(ex.getMessage());
        }
    }
}
