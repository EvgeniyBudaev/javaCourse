package yandex.sprint6.Strings.task6;

public class FindRepeats {
    int numberOfRepeats(String text, String substring) {
        int count = 0;
        while (text.contains(substring)) {
            count++;
            text = text.substring(text.indexOf(substring) + substring.length());
        }
        return count;
        //return text.split(substring, -1).length - 1;
    }
}
