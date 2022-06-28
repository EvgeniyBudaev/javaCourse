package programaniya.Classes.InnerClass;

public class Car2 {
    String color;
    private int doorCount;
    Engine engine;

    public Car2(String color, int doorCount) {
        this.color = color;
        this.doorCount = doorCount;
//        Engine e = new Engine(200);
//        System.out.println(e.horsePower);
    }

    public void setEngine(Engine engine) {
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

    public class Engine {
        private int horsePower;
        public final static int A = 5;

        public Engine(int horsePower) {
            this.horsePower = horsePower;
            System.out.println(doorCount);
        }

        @Override
        public String toString() {
            return "Engine{" +
                    "horsePower=" + horsePower +
                    '}';
        }
    }
}
