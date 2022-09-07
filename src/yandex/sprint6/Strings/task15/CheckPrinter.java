package yandex.sprint6.Strings.task15;

public class CheckPrinter {
    public void printCheck(String[] items) {
        for (String item: items) {
            String[] arr = item.split(", ");
            System.out.printf("%-10s %-10s %-10s%n", arr[0], arr[1], arr[2]);
        }
    }
}