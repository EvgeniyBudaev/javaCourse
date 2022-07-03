package programaniya.Multithreading.ConcurrentCollections.CopyOnWriteArrayList;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class Main {
    /* CopyOnWriteArrayList имплементирует интерфейс List.
    * CopyOnWriteArrayList следует использовать тогда, когда вам нужно добиться потокобезопасности, у вас небольшое
    *  количество операций по изменению элементов и большое количество по их чтению. */

    public static void main(String[] args) throws InterruptedException {
        CopyOnWriteArrayList<String> list = new CopyOnWriteArrayList<>();
        list.add("Bob");
        list.add("Marina");
        list.add("Mike");
        System.out.println(list); // [Bob, Marina, Mike]

        Runnable runnable1 = () -> {
            Iterator<String> iterator = list.iterator();
            while (iterator.hasNext()) {
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println(iterator.next()); // Bob Marina Mike
            }
        };

        Runnable runnable2 = () -> {
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            list.remove(2);
            list.add("Elena");
        };

        Thread thread1 = new Thread(runnable1);
        Thread thread2 = new Thread(runnable2);
        thread1.start();
        thread2.start();
        thread1.join();
        thread2.join();
        System.out.println(list); // [Bob, Marina, Elena]
    }
}
