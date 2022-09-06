package yandex.sprint6.Strings.task10;

public class FindRepeats {
    int numberOfRepeats(String text, String substring) {
        StringBuilder sb = new StringBuilder(text);
        sb.indexOf(substring);

        int count = 0;
        while (sb.indexOf(substring) != -1) {
            count++;
            int index = sb.indexOf(substring) + substring.length();
            sb = sb.delete(0, index);
        }
        return count;
    }
}