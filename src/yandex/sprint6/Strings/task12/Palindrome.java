package yandex.sprint6.Strings.task12;

public class Palindrome {
    public static void main(String[] args) {
        System.out.println(isPalindromeLine("Молебен о коне белом"));
    }
    public static boolean isPalindromeLine(String str) {
        String noSpaces = str
                .replaceAll("\\s+", "")
                .toLowerCase();
        return noSpaces.equals(new StringBuilder(noSpaces).reverse().toString().trim());
    }
}