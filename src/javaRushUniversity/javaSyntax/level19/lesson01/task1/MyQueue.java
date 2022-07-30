package javaRushUniversity.javaSyntax.level19.lesson01.task1; // task13.task1326;

import java.util.AbstractQueue;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class MyQueue extends AbstractQueue<String> {

    private final List<String> values = new ArrayList<>();

    @Override
    public Iterator<String> iterator() {
        //напишите тут ваш код
        return values.iterator();
    }

    @Override
    public int size() {
        //напишите тут ваш код
        return values.size();
    }

    @Override
    public boolean offer(String o) {
        //напишите тут ваш код
        return values.add(o);
    }

    @Override
    public String poll() {
        //напишите тут ваш код
        if (values.isEmpty()) {
            return null;
        }
        return values.remove(0);
    }

    @Override
    public String peek() {
        //напишите тут ваш код
        if (values.isEmpty()) {
            return null;
        }
        return values.get(0);
    }
}