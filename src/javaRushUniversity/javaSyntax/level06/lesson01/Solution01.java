package javaRushUniversity.javaSyntax.level06.lesson01; // task04.task0406;

import java.util.Scanner;

/*
Показываем, что получаем
*/

/* Вводим данные с клавиатуры и сразу их выводим на экран, пока не будет введено слово "enough".
Слово "enough" выводить не нужно.
Для этого необходимо использовать бесконечный цикл (while(true)). */

public class Solution01 {
    public static void main(String[] args) {
        //напишите тут ваш код
        Scanner scanner = new Scanner(System.in);

        while (true) {
            String s = scanner.nextLine();
            if (s.equals("enough")) {
                break;
            }
            System.out.println(s);
        }
    }
}
