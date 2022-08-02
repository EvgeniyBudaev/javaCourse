package yandex.sprint4.task7;

public abstract class Parallelogram implements Figure {
    private double a;
    private double b;

    public Parallelogram(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }
}