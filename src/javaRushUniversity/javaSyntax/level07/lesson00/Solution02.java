package javaRushUniversity.javaSyntax.level07.lesson00; // task05.task0502;

/*
Четные и нечетные ячейки массива
*/

/* В методе main(String[]) тебе нужно заполнить массив strings значениями. Если индекс массива чётный — присвоить
 значение "Чётный" (ноль — цифра чётная), иначе присвоить "Нечётный".
 Вывод текста в консоль в тестировании не участвует. */

public class Solution02 {
    public static final String ODD = "Нечётный";
    public static final String EVEN = "Чётный";
    public static String[] strings = new String[5];

    public static void main(String[] args) {
        //напишите тут ваш код

        System.out.print("index = 0");
        strings[0] = EVEN;
        System.out.println(" value = " + strings[0]);
        System.out.print("index = 1");
        strings[1] = ODD;
        System.out.println(" value = " + strings[1]);
        System.out.print("index = 2");
        strings[2] = EVEN;
        System.out.println(" value = " + strings[2]);
        System.out.print("index = 3");
        strings[3] = ODD;
        System.out.println(" value = " + strings[3]);
        System.out.print("index = 4");
        strings[4] = EVEN;
        System.out.println(" value = " + strings[4]);
    }
}
