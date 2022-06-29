package programaniya.LambdaExpressions.Supplier;

import java.util.ArrayList;
import java.util.function.Supplier;

public class Main {
    public static void main(String[] args) {
        /* Supplier - поставщик */
        ArrayList<Car> ourCars = createThreeCars(() -> new Car("Nissan Tilda", "Silver", 1.6));
        System.out.println(ourCars);
    }

    public static ArrayList<Car> createThreeCars(Supplier<Car> carSupplier) {
        ArrayList<Car> al = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            al.add(carSupplier.get());
        }
        return al;
    }
}

class Car {
    String model;
    String color;
    double engine;

    public Car(String model, String color, double engine) {
        this.model = model;
        this.color = color;
        this.engine = engine;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", engine=" + engine +
                '}';
    }
}
