package yandex.sprint4.task7;

public class Rectangle extends Parallelogram {
    public Rectangle(double a, double b) {
        super(a, b);
    }

    @Override
    public double getArea() {
        return super.getA() * super.getB();
    }
}