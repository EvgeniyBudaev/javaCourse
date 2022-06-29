package programaniya.LambdaExpressions.ForEach;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> list = List.of("privet", "kak dela", "normalno", "poka");
//        for (String s: list) {
//            System.out.println(s);
//        }
        list.forEach(str -> System.out.println(str));
    }
}
