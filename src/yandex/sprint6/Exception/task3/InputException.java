package yandex.sprint6.Exception.task3;

public class InputException extends Exception {
    public InputException() {
    }

    public InputException(final String message) {
        super(message);
    }

    public String getDetailMessage() {
        return getMessage();
    }
}
