package alishev.base.scanner;

import java.util.Scanner;

public class ScannerInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите текст");
        String text = scanner.nextLine();
        System.out.println("Введите число");
        int count = scanner.nextInt();
        System.out.println("Текст: " + text);
        System.out.println("Количество: " + count);
    }
}
