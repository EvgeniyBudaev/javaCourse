package programaniya.Classes.StaticNestedClass;

public class Car {
    String color;
    int doorCount;
    Engine engine;
    private static int a;

    public Car(String color, int doorCount, Engine engine) {
        this.color = color;
        this.doorCount = doorCount;
        this.engine = engine;
    }

    @Override
    public String toString() {
        return "Car{" +
                "color='" + color + '\'' +
                ", doorCount=" + doorCount +
                ", engine=" + engine +
                '}';
    }

    void method() {
        System.out.println(Engine.countOfObjects);
        Engine e = new Engine(200);
        System.out.println(e.horsePower);
    }

    public static class Engine {
        private int horsePower;
        static int countOfObjects;

        public Engine(int horsePower) {
            this.horsePower = horsePower;
            countOfObjects++;
            System.out.println(a);
        }

        @Override
        public String toString() {
            return "Engine{" +
                    "horsePower=" + horsePower +
                    '}';
        }
    }
}
