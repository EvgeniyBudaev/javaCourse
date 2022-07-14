package javaRushUniversity.javaSyntax.level06.lesson00;

/*
Незаполненный прямоугольник
*/

/* Используя вложенные циклы while (цикл в цикле) выведи на экран незаполненный прямоугольник (его контур) размером 10
 (высота) на 20 (ширина) из букв 'Б'.
  Незаполненная часть состоит из пробелов. */

public class Solution05 {
        public static void main(String[] args) {
            //напишите тут ваш код
            int row = 10;
            int col = 20;
            int n = 0;

            while (n < row) {
                int m = 0;

                while (m < col) {
                    if (n == 0) {
                        System.out.print("Б");
                    }
                    int c = 1;
                    while(c != row-1) {
                        if (n == c) {
                            if (m == 0 || m == col-1) {
                                System.out.print("Б");
                            } else {
                                System.out.print(" ");
                            }
                        }
                        c++;
                    }
                    if (n == row - 1) {
                        System.out.print("Б");
                    }
                    m++;
                }

                System.out.println();
                n++;
            }
        }
}
