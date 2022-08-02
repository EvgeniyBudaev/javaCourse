package yandex.sprint4.task7;

public class Square extends Rectangle {
    public Square(double a) {
        super(a, a);
    }

    @Override
    public double getArea() {
        return super.getA() * super.getA();
    }
}