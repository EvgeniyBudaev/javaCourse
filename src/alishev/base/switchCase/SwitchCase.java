package alishev.base.switchCase;

import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input your age: ");
        int age = scanner.nextInt();

        switch (age) {
            case 18 -> System.out.println("Welcome");
            default -> System.out.println("Not correctly age");
        }
    }
}
