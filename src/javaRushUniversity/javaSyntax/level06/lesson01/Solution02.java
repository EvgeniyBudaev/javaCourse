package javaRushUniversity.javaSyntax.level06.lesson01;

/*
Сумма чисел, не кратных 3
*/

/* Вывести на экран сумму чисел от 1 до 100 включительно, не кратных 3. Для этого используй цикл while. */

public class Solution02 {
    public static void main(String[] args) {
        //напишите тут ваш код
        int i = 0;
        int sum = 0;

        while (i < 100) {
            i++;
            if (i % 3 == 0) {
                continue;
            }
            sum += i;
        }
        System.out.println(sum);
    }
}
