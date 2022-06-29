package programaniya.LambdaExpressions.LambdaExpressions1;

public class Main2 {
    static void def(I i) {
        System.out.println(i.abc("Hello world"));
    }

    public static void main(String[] args) {
        def((String str) -> {return str.length();});
    }
}

interface I {
    int abc(String s);
}
