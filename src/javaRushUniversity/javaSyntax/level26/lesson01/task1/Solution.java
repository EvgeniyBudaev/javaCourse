package javaRushUniversity.javaSyntax.level26.lesson01.task1; // com.javarush.task.pro.task15.task1513;

import java.nio.file.Path;
import java.util.Scanner;

/*
Зри в корень
*/

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        //напишите тут ваш код
        Path path = Path.of(str);
        System.out.println(path.getRoot());
    }
}
