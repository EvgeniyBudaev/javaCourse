package yandex.sprint4.task1;

public class MountainHare {

    // добавьте переменные и конструктор
    private static String color;
    private final int age;
    private final double weight;
    private final int jumpLength;

    public MountainHare(int age, double weight, int jumpLength) {
        this.age = age;
        this.weight = weight;
        this.jumpLength = jumpLength;
    }

    public static void setColor(String color) {
        MountainHare.color = color;
    }

    @Override
    public String toString() {
        return "Заяц-беляк: " +
                "age=" + age +
                ", weight=" + weight +
                ", jumpLength=" + jumpLength +
                ", color=" + color +
                '.';
    }
}