package yandex.sprint6.Exception.task3;

public class LimitException extends RuntimeException {
    public int attempts;

    public LimitException(String message, int attempts) {
        super(message);
        this.attempts= attempts;
    }
}