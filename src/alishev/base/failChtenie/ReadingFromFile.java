package alishev.base.failChtenie;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class ReadingFromFile {
    public static void main(String[] args) throws FileNotFoundException {
        String separator = File.separator;
        String filePath = "src" + separator + "alishev" + separator + "base" + separator + "failChtenie" + separator + "test.txt";
        File file = new File(filePath);

        Scanner scanner = new Scanner(file);

        while (scanner.hasNextLine()) {
            System.out.println(scanner.nextLine());
        }

        scanner.close();

        // 1 2 3

        String numbersFilePath = "src" + separator + "alishev" + separator + "base" + separator + "failChtenie" + separator + "numbers.txt";
        File fileWithNumbers = new File(numbersFilePath);
        Scanner scanner2 = new Scanner(fileWithNumbers);
        String line = scanner2.nextLine();
        String[] numbersString = line.split(" ");
        int[] numbers = new int[3];
        int counter = 0;

        for (String number: numbersString) {
            numbers[counter++] = Integer.parseInt(number);
        }

        System.out.println(Arrays.toString(numbers));

        scanner.close();
    }
}
