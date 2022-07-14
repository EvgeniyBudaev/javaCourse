package javaRushUniversity.javaSyntax.level06.lesson00;

import java.util.Scanner;

/*
Суммирование
*/

/* Напишем программу, в которой нужно вводить с клавиатуры целые числа и считать их сумму, пока пользователь не введет
 слово "ENTER". Вывести на экран полученную сумму и завершить программу.
 */

public class Solution03 {
    public static void main(String[] args) {
        //напишите тут ваш код
        Scanner scanner = new Scanner(System.in);
        int sum = 0;

        while(scanner.hasNextInt()){
            sum += scanner.nextInt();
        }

        System.out.println(sum);
    }
}
