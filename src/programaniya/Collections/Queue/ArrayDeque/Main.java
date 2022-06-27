package programaniya.Collections.Queue.ArrayDeque;

import java.util.ArrayDeque;
import java.util.Deque;

public class Main {
    public static void main(String[] args) {
        /* Deque - double ended queue (двунаправленная очередь). В такой очереди элементы могут использоваться с обоих
        * концов. Здесь работают оба правила - FIFO и LIFO.
        * Интерфейс Deque реализуется классами LinkedList и ArrayDeque. */
        Deque<Integer> deque = new ArrayDeque<>();
        deque.addFirst(1);
        deque.addLast(10);
        deque.addFirst(7);
        deque.addFirst(5);
        System.out.println(deque); // [5, 7, 1, 10]
        deque.offerFirst(4);
        deque.offerLast(6);
        System.out.println(deque); // [4, 5, 7, 1, 10, 6]

        System.out.println(deque.getFirst());
        System.out.println(deque.getLast());

        System.out.println(deque.peekFirst()); // peekFirst не выбрасывает исключение
        System.out.println(deque.peekLast()); // peekLast не выбрасывает исключение

        System.out.println(deque.pollFirst());
        System.out.println(deque.pollLast());

        System.out.println(deque.removeFirst());
        System.out.println(deque.removeLast());
    }
}
