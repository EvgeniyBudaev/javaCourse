package programaniya.Streams.ParallelStream;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        /* Parallel Stream - этовозможность использования нескольких ядер процессора при выполнении каких-либо операций
        со stream */
        List<Double> list = new ArrayList<>();
        list.add(10.0);
        list.add(5.0);
        list.add(1.0);
        list.add(0.25);

        double sumResult = list.stream()
                .reduce((acc, el) -> acc + el).get();
        System.out.println("Sum result: " + sumResult); // 1sec, 303ms

        double sumResult2 = list.parallelStream()
                .reduce((acc, el) -> acc + el).get();
        System.out.println("Sum result2: " + sumResult2); // 1sec, 111ms

        
    }
}
