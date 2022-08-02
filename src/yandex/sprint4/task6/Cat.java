package yandex.sprint4.task6;

public class Cat extends Pet {
    public Cat() {
        super("мяу");
    }

    public void catchMouse() {
        System.out.println("Поймала мышку!");
    }

    @Override
    public void giveVoice() {
        System.out.println("мяу");
    }
}
