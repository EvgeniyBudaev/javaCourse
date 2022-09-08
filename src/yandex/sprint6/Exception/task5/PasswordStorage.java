package yandex.sprint6.Exception.task5;

import java.io.IOException;

public interface PasswordStorage {
    void open() throws IOException;
    void store(String user, String password) throws IOException;
    String get(String user) throws IOException;
    void close();
}