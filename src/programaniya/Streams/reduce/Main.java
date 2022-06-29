package programaniya.Streams.reduce;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(8);
        list.add(2);
        list.add(4);
        list.add(3);

        // Variant 1
        int result = list.stream().reduce((accumulator, element) ->
                accumulator * element).get();
        System.out.println(result); // 960 // если не будет значения, то выбросится исключение

        // Variant 2
        int result2 = list.stream().reduce(1, (accumulator, element) -> // 1 - начальное значение
                accumulator * element);
        System.out.println(result2);

        // Variant 3
        List<Integer> list100 = new ArrayList<>();
        Optional<Integer> o = list100.stream().reduce((accumulator, element) ->
                accumulator * element);
        if (o.isPresent()) { // isPresent - если есть значение
            System.out.println(o.get());
        } else {
            System.out.println("Not present");
        }

        // Variant 4
        List<String> text = new ArrayList<>();
        text.add("privet");
        text.add("kak dela");
        text.add("ok");
        text.add("poka");
        String result3 = text.stream().reduce((acc, el) ->
                acc + " " + el).get();
        System.out.println(result3);
    }
}
