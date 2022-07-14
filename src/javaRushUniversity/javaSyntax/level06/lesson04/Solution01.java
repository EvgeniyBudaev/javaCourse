package javaRushUniversity.javaSyntax.level06.lesson04;

/*
Рисуем треугольник
*/

/* Давай используем цикл for, чтобы вывести на экран прямоугольный треугольник из восьмёрок со сторонами (катетами) 10 и 10.
То есть в первой строке должна быть одна 8, начиная слева, во второй - две и т.д. */

public class Solution01 {
    public static void main(String[] args) {
        //напишите тут ваш код
        for (int i = 10; i > 0; i--) {
            for (int j = i; j < 11; j++) {
                System.out.print("8");
            }
            System.out.println();
        }
    }
}
