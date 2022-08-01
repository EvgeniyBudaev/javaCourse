package javaRushUniversity.javaSyntax.level20.lesson02;

public enum MySingleton {
    INSTANCE;

    private MySingleton() {
        MySingleton.getInstance();
    }

    public static MySingleton getInstance() {
        System.out.println("создание экземпляра...");
        return null;
    }
}
