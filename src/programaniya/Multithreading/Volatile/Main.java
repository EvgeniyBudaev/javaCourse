package programaniya.Multithreading.Volatile;

public class Main extends Thread {
    /* volatile - значение переменной будет храниться только в Main Memory, а не в кеше cpu */
    /* Ключевое слово volatile используется дляпометки переменной,как хранящейся в основной памяти "main memory". */
    /* Для синхронизации значения переменной между потоками ключевое слово volatile используется тогда, когда только
     один поток может изменять значение этой переменной, а остальные потоки могут его только читать. */
    volatile boolean flag = true;

    public void run() {
        long counter = 0;
        while (flag) {
            counter++;
        }
        System.out.println("Loop is finished. counter = " + counter);
    }

    public static void main(String[] args) throws InterruptedException {
        Main thread = new Main();
        thread.start();
        Thread.sleep(3000);
        System.out.println("After 3 seconds it is time to wake up!");
        thread.flag = false;
        thread.join();
        System.out.println("End of program");
    }
}
