package yandex.sprint4.task6;

public class Dog extends Pet {
    public Dog() {
        super("Gav");
    }

    public void bringStick() {
        System.out.println("Принёс палочку, как хороший мальчик!");
    }

    @Override
    public void giveVoice() {
        System.out.println("Gav");
    }
}
