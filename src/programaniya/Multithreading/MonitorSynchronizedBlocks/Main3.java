package programaniya.Multithreading.MonitorSynchronizedBlocks;

public class Main3 {
//    static final Car car = new Car();
    static final Object lock = new Object();
    void mobileCall() {
        synchronized (lock) {
            System.out.println("Mobile call starts");
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("Mobile call ends");
        }
    }

    void skypeCall() {
        synchronized (lock) {
            System.out.println("Skype call starts");
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("Skype call ends");
        }
    }

    void whatsappCall() {
        synchronized (lock) {
            System.out.println("Whatsapp call starts");
            try {
                Thread.sleep(7000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("Whatsapp call ends");
        }
    }

    public static void main(String[] args) {
        Thread thread1 = new Thread(new RunnableImpMobile());
        Thread thread2 = new Thread(new RunnableImpSkype());
        Thread thread3 = new Thread(new RunnableImpWhatsapp());
        thread1.start();
        thread2.start();
        thread3.start();
    }
}

class RunnableImpMobile implements Runnable {
    @Override
    public void run() {
        new Main3().mobileCall();
    }
}

class RunnableImpSkype implements Runnable {
    @Override
    public void run() {
        new Main3().skypeCall();
    }
}

class RunnableImpWhatsapp implements Runnable {
    @Override
    public void run() {
        new Main3().whatsappCall();
    }
}

//class Car {}
