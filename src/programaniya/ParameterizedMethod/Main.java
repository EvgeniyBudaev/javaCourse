package programaniya.ParameterizedMethod;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(20);
        int result = GenMethod.getSecondElement(numbers);
        System.out.println(result);
    }
}

class GenMethod {
    public static <T> T getSecondElement(ArrayList<T> list) {
        return list.get(1);
    }
}
