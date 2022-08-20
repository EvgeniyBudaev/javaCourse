package javaRushUniversity.javaSyntax.level22.lesson00.task2;

public class ChildrenNotInitializedException extends RuntimeException {
    public ChildrenNotInitializedException(String message) {
        super(message);
        System.out.println(message);
    }
}
