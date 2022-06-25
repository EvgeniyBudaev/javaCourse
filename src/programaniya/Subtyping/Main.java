package programaniya.Subtyping;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Info<String> info1 = new Info<>("Hello world");
        System.out.println(info1);
        String s = info1.getValue();
        System.out.println(s);
    }
}

class Info<T extends String> {
// class Info<T extends String&I1&I2> {
    private T value; // not may be static

    public Info(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }


    @Override
    public String toString() {
        return "{[" + value + "]}";
    }
}

class GenMethod {
    public static <T extends String> T getSecondElement(ArrayList<T> list) {
        return list.get(1);
    }
}

interface I1 {}

interface I2 {}

