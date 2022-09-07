package yandex.sprint6.Strings.task11;

public class Palindrome {
    public boolean isPalindromeWord(String str) {
        StringBuilder sb = new StringBuilder(str);
        StringBuilder sbReverse = sb.reverse();
        if (str.equals(String.valueOf(sbReverse))){
            return true;
        }
        return false;
    }
}