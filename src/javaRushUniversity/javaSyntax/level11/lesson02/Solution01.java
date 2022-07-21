package javaRushUniversity.javaSyntax.level11.lesson02; // task09.task0915;

import java.util.Arrays;
import java.util.StringTokenizer;

/*
StringTokenizer
*/

/* Используя StringTokenizer раздели query на части по разделителю delimiter. */

public class Solution01 {
    public static void main(String[] args) {
        String packagePath = "java.util.stream";
        String[] tokens = getTokens(packagePath, "\\.");
        System.out.println(Arrays.toString(tokens));
    }

    public static String[] getTokens(String query, String delimiter) {
        //напишите тут ваш код
        StringTokenizer tokenizer = new StringTokenizer(query,delimiter);
        String[] result = new String[tokenizer.countTokens()];
        for (int i = 0; i < result.length; i++) {
            result[i] = tokenizer.nextToken();
        }
        return result;
    }
}
