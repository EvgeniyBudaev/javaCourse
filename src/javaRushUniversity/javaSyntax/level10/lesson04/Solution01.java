package javaRushUniversity.javaSyntax.level10.lesson04; // task09.task0912;

/*
Проверка URL-адреса
*/

/* Проверка URL-адреса

В этой задаче тебе нужно выполнить проверку URL-адреса.

Простая схема URL-адреса выглядит так:
<сетевой протокол>://<название ресурса>.<домен> */

public class Solution01 {
    public static void main(String[] args) {
        String[] urls = {"https://javarush.ru", "https://google.com", "http://wikipedia.org", "facebook.com", "https://instagram", "codegym.cc"};
        for (String url : urls) {
            String protocol = checkProtocol(url);
            String domain = checkDomain(url);

            System.out.println("У URL-адреса - " + url + ", сетевой протокол - " + protocol + ", домен - " + domain);
        }
    }

    public static String checkProtocol(String url) {
        //напишите тут ваш код
        if (url.startsWith("http:")) {
            return "http";
        } else if (url.startsWith("https:")) {
            return "https";
        } else {
            return "неизвестный";
        }
    }

    public static String checkDomain(String url) {
        //напишите тут ваш код
        if (url.endsWith(".com")) {
            return "com";
        } else if (url.endsWith(".net")) {
            return "net";
        } else if (url.endsWith(".org")) {
            return "org";
        } else if (url.endsWith(".ru")) {
            return "ru";
        } else {
            return "неизвестный";
        }
    }
}
