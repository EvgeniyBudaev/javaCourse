package alishev.base.exception;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Exception1 {
    public static void main(String[] args) {
        voidReadFile1();

        try {
            voidReadFile2();
        } catch (FileNotFoundException e) {
            System.out.println("File2 not found");
        }
    }

    public static void voidReadFile1() {
        File file = new File("abs");
        try {
            Scanner scanner = new Scanner(file);
        } catch (FileNotFoundException e) {
            System.out.println("File1 not found");
        }

        System.out.println("This block will be executed");
    }

    public static void voidReadFile2() throws FileNotFoundException {
        File file = new File("abs");
        Scanner scanner = new Scanner(file);
    }
}
