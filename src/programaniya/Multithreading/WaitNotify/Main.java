package programaniya.Multithreading.WaitNotify;

public class Main {
    /* Для извещения потоком других потоков о своих действиях частоиспользуются следующие методы: */
    /* wait - освобождает монитор и переводит вызывающий поток в состояние ожидания до тех пор, пока другой поток не
     вызовет метод notify(); */
    /* notify - НЕ освобождает монитор и будит поток, у которого ранее был вызван метод wait(); */
    /* notifyAll - НЕ освобождает монитор и будит все потоки, у которого ранее был вызван метод wait(); */

    public static void main(String[] args) {
        Market market = new Market();
        Producer producer = new Producer(market);
        Consumer consumer = new Consumer(market);
        Thread thread1 = new Thread(producer);
        Thread thread2 = new Thread(consumer);
        thread1.start();
        thread2.start();
    }
}

class Market {
    private int breadCount = 0;

    public synchronized void getBread() {
        while (breadCount < 1) {
            try {
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

        breadCount--;
        System.out.println("Потребитель купил один хлеб");
        System.out.println("Количество хлеба вмагазине = " + breadCount);
        notify();
    }

    public synchronized void putBread() {
        while (breadCount >= 5) {
            try {
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

        breadCount++;
        System.out.println("Производитель добавил на витрину 1шт хлеба");
        System.out.println("Количество хлеба вмагазине = " + breadCount);
        notify();
    }
}

class Producer implements Runnable {
    Market market;

    public Producer(Market market) {
        this.market = market;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            market.putBread();
        }
    }
}

class Consumer implements Runnable {
    Market market;

    public Consumer(Market market) {
        this.market = market;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            market.getBread();
        }
    }
}