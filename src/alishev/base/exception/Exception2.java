package alishev.base.exception;

import java.io.IOException;
import java.util.Scanner;

public class Exception2 {
//    public static void main(String[] args) throws IOException {
//        Scanner scanner = new Scanner(System.in);
//
//        while (true) {
//            int x = Integer.parseInt(scanner.nextLine());
//
//            if (x != 0) {
//                throw new IOException();
//            }
//        }
//    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            int x = Integer.parseInt(scanner.nextLine());

//            if (x != 0) {
//                try {
//                    throw new IOException();
//                } catch (IOException e) {
//                    System.out.println("Пользователь ввел что-то кроме нуля");
//                }
//            }
            if (x != 0) {
                try {
                    throw new ScannerException("Пользователь ввел что-то кроме нуля1");
                } catch (ScannerException e) {
                    System.out.println("Пользователь ввел что-то кроме нуля2");
                }
            }
        }
    }
}
