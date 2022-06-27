package programaniya.Collections.Queue.LinkedList;

import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        /* Queue - это коллекция, хранящая последовательность элементов.
        * Добавляется элемент в конец очереди, используется из начала очереди - правило FIFO. */
        Queue<String> queue = new LinkedList<>();
        queue.add("Mike"); // add - выбрасывает исключение если нет места в очереди
        queue.add("Bob");
        queue.add("Nina");
        System.out.println(queue); // [Mike, Bob, Nina]
        queue.offer("Olga"); // offer - не выбрасывает исключение если в очереди нет места
        System.out.println(queue.element()); // Bob // element - кто на первом месте в очереди
        System.out.println(queue.peek()); // peek работает как и element(), только не выбрасывает исключение а вовзращает null

        System.out.println(queue.remove()); // Mike // remove удаляет элемент, возвращает его и выбрасывает исключение если нет элемента
        System.out.println(queue.remove("Nina"));
        System.out.println(queue.poll()); // poll - удаляет элемент и вернет null, если элемента нет
    }
}
