package programaniya.Multithreading.CallableFuture;

import java.util.concurrent.*;

public class Main {
    /* Callable, также как и Runnable, представляет собой определенное задание, которое выполняется потоком.
    * В отличии от Runnable Callable:
    * 1) имеет return type не void
    * 2) может выбрасывать Exception */
    /* Метод submit передаёт наше задание (task) в thread pool, для выполнения его одним из потоков, и возвращает тип
     Future, в котором и хранится результат выполнения нашего задания. */
    /* Метод get позволяет получить результат выполнения нашего задаия из объекта Future. */
    static int factorialResult;

    public static void main(String[] args) {
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        Factorial1 factorial1 = new Factorial1(5);
        Future<Integer> future = executorService.submit(factorial1);
        try {
            System.out.println(future.isDone()); // false
            System.out.println("Хотим получить результат");
            factorialResult = future.get();
            System.out.println("Получили результат");
            System.out.println(future.isDone()); // true
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } catch (ExecutionException e) {
            System.out.println(e.getCause());
            throw new RuntimeException(e);
        } finally {
            executorService.shutdown();
        }

        System.out.println(factorialResult); // 120
    }
}

class Factorial1 implements Callable<Integer> {
    int f;

    public Factorial1(int f) {
        this.f = f;
    }

    @Override
    public Integer call() throws Exception {
        if (f <= 0) {
            throw new Exception("Вы ввели неверное число");
        }
        int result = 1;
        for (int i = 1; i <= f; i++) {
            result *= i;
            Thread.sleep(1000);
        }
        return result;
    }
}
