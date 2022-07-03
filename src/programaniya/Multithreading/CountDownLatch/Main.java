package programaniya.Multithreading.CountDownLatch;

import org.jetbrains.annotations.NotNull;

import java.util.concurrent.CountDownLatch;

public class Main {
    static CountDownLatch countDownLatch = new CountDownLatch(3);

    private static void marketStaffIsOnPlace() throws InterruptedException {
        Thread.sleep(2000);
        System.out.println("Market staff came to work");
        countDownLatch.countDown();
        System.out.println("countDownLatch = " + countDownLatch.getCount());
    }

    private static void everythingIsReady() throws InterruptedException {
        Thread.sleep(3000);
        System.out.println("Everything is ready, so let's open market");
        countDownLatch.countDown();
        System.out.println("countDownLatch = " + countDownLatch.getCount());
    }

    private static void openMarket() throws InterruptedException {
        Thread.sleep(4000);
        System.out.println("Market is opened");
        countDownLatch.countDown();
        System.out.println("countDownLatch = " + countDownLatch.getCount());
    }

    /* CountDownLatch - замок с обратным отчетом. */
    /* CountDownLatch - это синхронизатор, позволяющий любому количеству потоков ждать пока не завершиться определенное
     количество операций. В конструктор CountDownLatch нужно передавать количество операций, которые должны завершиться,
     чтобы потоки продолжили свою работу. */

    public static void main(String[] args) throws InterruptedException {
        new Friend("Bob", countDownLatch);
        new Friend("Victor", countDownLatch);
        new Friend("Andrey", countDownLatch);
        new Friend("Marina", countDownLatch);
        new Friend("Kite", countDownLatch);

        marketStaffIsOnPlace();
        everythingIsReady();
        openMarket();
    }
}

class Friend extends Thread {
    String name;
    private CountDownLatch countDownLatch;

    public Friend(String name, CountDownLatch countDownLatch) {
        this.name = name;
        this.countDownLatch = countDownLatch;
        this.start();
    }

    @Override
    public void run() {
        try {
            countDownLatch.await();
            System.out.println(name + " приступил к закупкам");
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
