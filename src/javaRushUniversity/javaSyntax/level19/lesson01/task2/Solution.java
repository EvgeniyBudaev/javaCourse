package javaRushUniversity.javaSyntax.level19.lesson01.task2; // task13.task1327;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

/* В строке объявления поля queue инициализируй его другим классом вместо LinkedList так, чтобы метод main вывел все
буквы в алфавитном порядке. */

public class Solution {

    public static Queue<Character> queue = new PriorityQueue<>();

    public static void main(String[] args) {
        queue.addAll(Arrays.asList('М', 'Ч', 'Р', 'Ж', 'Ц', 'В', 'С', 'А', 'Ф', 'Н', 'З', 'Б', 'Ш', 'К', 'О', 'У', 'Г', 'П', 'И', 'Е', 'Т', 'Х', 'Л'));

        while (queue.size() > 0) {
            System.out.println(queue.poll());
        }
    }
}
