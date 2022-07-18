package javaRushUniversity.javaSyntax.level04.lesson00; // task03.task0302;

import java.util.Scanner;

/*
Призывная кампания
*/

/* Ввести с клавиатуры имя и возраст. Если возраст в пределах 18-28 (включительно), то вывести надпись "Имя,
 явитесь в военкомат", где Имя - это имя, введенное ранее с клавиатуры. */

public class Solution02 {
    public static void main(String[] args) {
        String militaryCommissar = ", явитесь в военкомат";
        //напишите тут ваш код
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        int age = scanner.nextInt();
        if (age >= 18 && age <= 28) {
            System.out.println(name + militaryCommissar);
        }
    }
}
