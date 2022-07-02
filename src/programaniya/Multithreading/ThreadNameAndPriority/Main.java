package programaniya.Multithreading.ThreadNameAndPriority;

public class Main {
    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        myThread.start();
        System.out.println("Name of myThread = " + myThread.getName() +
                " Priority of myThread = " + myThread.getPriority());
        // Name of myThread = Thread-0 Priority of myThread = 5

        myThread.setName("moy_potok");
        myThread.setPriority(10);
        // или
        myThread.setPriority(Thread.MAX_PRIORITY);
        myThread.setPriority(Thread.MIN_PRIORITY);
        myThread.setPriority(Thread.NORM_PRIORITY);
    }
}

class MyThread extends Thread {
    @Override
    public void run() {
        System.out.println("Hello World");
        // currentThread - показать текущий поток
        System.out.println("Method run. Thread name = " + Thread.currentThread());
    }
}
