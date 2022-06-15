package alishev.base.anonimnieClassi;

public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.eat();

        Animal animal2 = new Animal() {
            @Override
            public void eat() {
                System.out.println("OtherAnimal is eating...");
            }
        };
        animal2.eat();

        // OtherAnimal otherAnimal = new OtherAnimal();
        // otherAnimal.eat();

//        AbleToEat ableToEat = new Animal();
//        ableToEat.eat();

        AbleToEat ableToEat = new AbleToEat() {
            @Override
            public void eat() {
                System.out.println("Someone is eating...");
            }
        };
        ableToEat.eat();
    }
}
