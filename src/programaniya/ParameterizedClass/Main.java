package programaniya.ParameterizedClass;

public class Main {
    public static void main(String[] args) {
        Info<String> info1 = new Info<>("Hello world");
        System.out.println(info1);
        String s = info1.getValue();
        System.out.println(s);
    }
}

class Info<T> {
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
