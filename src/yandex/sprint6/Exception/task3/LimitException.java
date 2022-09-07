package yandex.sprint6.Exception.task3;

public class LimitException extends RuntimeException {
    private int inputValue;

    public LimitException(int inputValue) {
        this.inputValue = inputValue;
    }

    public LimitException(final String message) {
        super(message);
    }

    public LimitException(final String message, int inputValue) {
        super(message);
        this.inputValue = inputValue;
    }

    public String getDetailMessage() {
        return getMessage() + " " + inputValue;
    }
}