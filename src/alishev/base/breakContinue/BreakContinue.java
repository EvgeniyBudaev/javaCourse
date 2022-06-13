package alishev.base.breakContinue;

import java.util.Scanner;

public class BreakContinue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input value ");
        int value = scanner.nextInt();;

        while(true) {
            if (value == 5) {
                break;
            }

            System.out.println("value: " + value);
            value++;
        };
        System.out.println("The end.");

        // Example with continue
        for (int i = 0; i < 5; i++) {
            if (i % 2 == 0) {
                continue;
            }
            System.out.println("i: " + i);
        }
    }
}
