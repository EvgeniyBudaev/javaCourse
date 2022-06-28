package programaniya.Classes.InnerClass;

public class Main {
    public static void main(String[] args) {
        /* 1) Каждый объект inner класса всегда ассоциируется с объектом внешнего класса
        * 2) Создавая объект inner класса, нужно перед этим создать объект его внешнего класса
        * 3) Inner класс может содержать только non-static элементы
        * 4) Inner класс может обращаться даже к private элементам внешнего класса
        * 5) Внешний класс может обращаться даже к private элементам inner класса, прежде создавего объект */
        Car car = new Car("Black", 4, 300);
        System.out.println(car); // Car{color='Black', doorCount=4, engine=Engine{horsePower=300}}

        Car2 car2 = new Car2("White", 4);
        Car2.Engine engine = car2.new Engine(300);
        car2.setEngine(engine);
        System.out.println(car2); // Car{color='White', doorCount=4, engine=Engine{horsePower=300}}

        Car2.Engine engine3 = new Car2("Silver", 4).new Engine(300);
    }
}
