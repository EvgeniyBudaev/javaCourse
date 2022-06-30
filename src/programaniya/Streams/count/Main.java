package programaniya.Streams.count;

import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        /* count - считает кол-во элементов в стриме. Terminal method.
        * Возвращает не int, а long. */
        Stream<Integer> stream1 = Stream.of(1, 2, 3, 4, 5, 1, 2, 3);
        System.out.println(stream1.count()); // 8
    }
}
