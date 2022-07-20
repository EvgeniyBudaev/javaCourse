package javaRushUniversity.javaSyntax.level10.lesson04; // task09.task0914;

/*
Обновление пути
*/

/* Реализуй метод changePath(String, String) так, чтобы он заменял версию jdk в пути, полученном первым параметром
метода, на версию, полученную вторым параметром, и возвращал новый путь.
Версия jdk начинается со строки "jdk" и заканчивается на "/". */

public class Solution03 {
    public static void main(String[] args) {
        String path = "/usr/java/jdk1.8/bin/";

        String jdk13 = "jdk-13";
        System.out.println(changePath(path, jdk13));
    }

    public static String changePath(String path, String jdk) {
        //напишите тут ваш код
        return path.replaceFirst("jdk[^/]*", jdk);
    }
}
