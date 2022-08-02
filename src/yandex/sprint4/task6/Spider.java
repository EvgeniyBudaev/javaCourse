package yandex.sprint4.task6;

public class Spider extends Pet {
    public Spider() {
        super("у");
        super.setPawsCount(8);
    }

    @Override
    public void giveVoice() {
        System.out.println("у");
    }
}
