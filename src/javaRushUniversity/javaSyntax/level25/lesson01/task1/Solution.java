package javaRushUniversity.javaSyntax.level25.lesson01.task1; // com.javarush.task.pro.task15.task1532;

import java.io.ByteArrayOutputStream;

/*
Шифр
*/

public class Solution {

    public static void main(String[] args) {
        System.out.println(encrypt("abcdefghi"));
    }

    public static ByteArrayOutputStream encrypt(String message) {
        //напишите тут ваш код
        byte[] bytes = message.getBytes();
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(bytes.length);

        for (int i = 0; i < bytes.length / 2; i++) {
            byteArrayOutputStream.write(bytes[i]);
            byteArrayOutputStream.write(bytes[bytes.length - 1 - i]);
        }

        if (bytes.length % 2 == 1) {
            byteArrayOutputStream.write(bytes[bytes.length / 2]);
        }

        return byteArrayOutputStream;
    }
}
