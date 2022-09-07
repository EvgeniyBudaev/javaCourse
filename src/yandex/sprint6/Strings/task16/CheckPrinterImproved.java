package yandex.sprint6.Strings.task16;

public class CheckPrinterImproved {
    public static void main(String[] args) {
        String[] arr = {"Пицца, 1 шт., 310.50", "Чай, 2 шт., 113.30", "Печенье, 1 уп., 75.75", "Нить красная, 1 клубок, 12.23"};
        printCheck(arr);
    }

    private static int findMaxLength(String[] elements) {
        int max = 0;
        for (String e : elements) {
            if (e.length() > max) {
                max = e.length();
            }
        }
        return max;
    }

    public static void printCheck(String[] items) {
        int maxLength = findMaxLength(items) + 2;
        for (String item: items) {
            String[] arr = item.split(", ");
            String kof = "%-" + maxLength + "s";
            System.out.printf(kof + kof + kof + "%n", arr[0], arr[1], arr[2]);
        }
    }
}