package yandex.sprint6.Strings.task12;

public class Palindrome {
    public boolean isPalindromeLine(String str) {
        String noSpaces = str
                .replaceAll("\\s+", "")
                .toLowerCase();
        return noSpaces.equals(new StringBuilder(noSpaces).reverse().toString().trim());
    }
}