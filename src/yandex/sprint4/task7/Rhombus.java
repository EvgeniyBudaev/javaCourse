package yandex.sprint4.task7;

public class Rhombus extends Parallelogram {
    public Rhombus(double a, double h) {
        super(a, h);
    }

    @Override
    public double getArea() {
        return super.getA() * super.getB();
    }
}