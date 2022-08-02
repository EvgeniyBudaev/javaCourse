package yandex.sprint4.task6;

public abstract class Pet {
    private String voice;
    private int pawsCount;

    public Pet(String voice) {
        this.voice = voice;
    }

    public void play() {
        System.out.println("Играю");
    }

    public void sleep() {
        System.out.println("сплю");
    }

    public abstract void giveVoice();

    public int getPawsCount() {
        return pawsCount;
    }

    public void setPawsCount(int pawsCount) {
        this.pawsCount = pawsCount;
    }
}
