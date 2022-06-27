package programaniya.Classes.StaticNestedClass;

public class Main {
    public static void main(String[] args) {
        /* 1) static nested класс может обращаться даже к private элементам внешнего класса, но только к static.
        * 2) Внешний класс может обращаться даже к private элементам static nested класса.
        * 3) static nested класс модет содержать static и non-static элементы.
        * 4) Создавать объект static nested класса, нужно указывать и класс, содержащий его. */
        Car.Engine engine = new Car.Engine(256);
        Car car = new Car("red", 4, engine);
        System.out.println(car);
    }
}
