package yandex.sprint4.task6;

public class Hamster extends Pet {
    public Hamster() {
        super("Hhh");
    }

    public void hideFood() {
        System.out.println("Вся еда — в щёчках!");
    }

    @Override
    public void giveVoice() {
        System.out.println("H");
    }
}
