package alishev.base.exception;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Exception3 {
    public static void main(String[] args) throws FileNotFoundException {
        // Checked Exception (Compile time exception)
        File file = new File("test");
        Scanner scanner = new Scanner(file);

        // Unchecked Exception (Runtime exception)
        int number = 1 / 0;
        String name = null;
        int[] arr = new int[2];
        System.out.println(arr[5]);
    }
}
