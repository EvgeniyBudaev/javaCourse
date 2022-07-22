package programaniya.Enum;

public enum WeekDays {
    MONDAY("bad"), TUESDAY("bad"), WEDNESDAY("so-so"), THURSDAY("so-so"), FRIDAY("good"),
    SATURDAY("great"), SUNDAY("good");

    private String mood; // mood - настроение

    WeekDays(String mood) {
        this.mood = mood;
    }

    public String getMood() {
        return mood;
    }
}
