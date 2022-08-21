package javaRushUniversity.javaSyntax.level25.lesson00.task2;

public class MyClass implements java.io.Serializable {
    private final String string;

    public MyClass(String string) {
        this.string = string;
    }

    @Override
    public String toString() {
        return "MyClass{" +
                "string='" + string + '\'' +
                '}';
    }
}

