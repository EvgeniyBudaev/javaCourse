package programaniya.LambdaExpressions.Consumer;

import java.util.ArrayList;
import java.util.function.Supplier;
import java.util.function.Consumer;

public class Main {
    public static void main(String[] args) {
        /* Consumer - потребитель */
        ArrayList<Car> ourCars = createThreeCars(() -> new Car("Nissan Tilda", "Silver", 1.6));
        System.out.println(ourCars);
        System.out.println(" ");

        changeCar(ourCars.get(0), car -> {
            car.color = "red";
            car.engine = 2.4;
            System.out.println("Upgraded car: " + car);
        });
        System.out.println(ourCars);
    }

    public static ArrayList<Car> createThreeCars(Supplier<Car> carSupplier) {
        ArrayList<Car> al = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            al.add(carSupplier.get());
        }
        return al;
    }

    public static void changeCar(Car car, Consumer<Car> carConsumer) {
        carConsumer.accept(car);
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
