package programaniya.Multithreading.ConcurrentCollections.ArrayBlockingQueue;

import java.util.concurrent.ArrayBlockingQueue;

public class Main {
    /* ArrayBlockingQueue -  потокобезопасная очередь с ограниченным размером (capacity restricted). */
    /* Обычно один или несколько поток добавляют элементы в конец очереди, а другой или другие потоки забирают элементы
    * из начала очереди. */

    public static void main(String[] args) {
        ArrayBlockingQueue<Integer> queue = new ArrayBlockingQueue<>(4);
//        queue.add(1);
//        queue.add(2);
//        queue.add(3);
//        queue.add(4);
//        System.out.println(queue); // [1, 2, 3, 4]

        // Producer
        new Thread(() -> {
            int i = 0;
            while (true) {
                try {
                    queue.put(++i);
                    System.out.println("Producer dobavil: " + i + " " + queue);
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }).start();

        // Consumer
        new Thread(() -> {
            while (true) {
                try {
                    Integer j = queue.take();
                    System.out.println("Consumer zabral: " + j + " " + queue);
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }).start();
    }
}
