package alishev.base.serialisation.aboutTransient;

import java.io.Serial;
import java.io.Serializable;

class Person implements Serializable {
    @Serial
    private static final long serialVersionUID = -3722203743604454371L;
    private int id;
    private transient String name; // transient - мы не хотим это поле сериализовывать

    public Person(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String toString() {
        return id + " : " + name;
    }
}
