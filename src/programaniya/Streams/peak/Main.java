package programaniya.Streams.peak;

import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        /* peek - такое же как и forEach, только возвращает не void, а Stream */
        Stream<Integer> stream1 = Stream.of(1, 2, 3, 4, 5, 1, 2, 3);
        System.out.println(stream1.distinct().peek(System.out::println).count());
    }
}
