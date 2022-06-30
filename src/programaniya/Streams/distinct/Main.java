package programaniya.Streams.distinct;

import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        /* distinct - возвращает Stream уникальных элементов, а проверяет он их с помощью
        * метода equals */
        Stream<Integer> stream1 = Stream.of(1, 2, 3, 4, 5, 1, 2, 3);
        stream1.distinct().forEach(System.out::println); // 1, 2, 3, 4, 5
    }
}
