package programaniya.Multithreading.Interruption;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Main start");
        InterruptedThread thread = new InterruptedThread();
        thread.start();
        Thread.sleep(2000);
        thread.interrupt(); // interrupt - прервать поток
        thread.join();
        System.out.println("Main ends");
    }
}

class InterruptedThread extends Thread {
    double sqrtSum = 0;

    public void run() {
        for (int i = 0; i <= 1_000_000_000; i++) {
            if (isInterrupted()) {
                System.out.println("Поток хотят прервать.");
                System.out.println("Мы убедились, что состояние всех объектов нормальное и решили завершить работу" +
                        " потока.");
                return;
            }
            sqrtSum += Math.sqrt(i);
            try {
                sleep(10000);
            } catch (InterruptedException e) {
                System.out.println("Поток хотят прервать во время сна.");
                System.out.println("Давайте завершим его работу.");
                return;
            }
        }
        System.out.println(sqrtSum);
    }
}