package javaRushUniversity.javaSyntax.level20.lesson00.task3; // task13.task1317;

/*
Трансформируем enum в класс
*/

/* Пришло время раскрыть все карты и понять, как на самом деле работает enum. Тебе нужно из enum Month сделать class, а
также добавить и реализовать методы ordinal() и values(). */

public class Month {
    public static final Month JANUARY = new Month(0);
    public static final Month FEBRUARY = new Month(1);
    public static final Month MARCH = new Month(2);
    public static final Month APRIL = new Month(3);
    public static final Month MAY = new Month(4);
    public static final Month JUNE = new Month(5);
    public static final Month JULY = new Month(6);
    public static final Month AUGUST = new Month(7);
    public static final Month SEPTEMBER = new Month(8);
    public static final Month OCTOBER = new Month(9);
    public static final Month NOVEMBER = new Month(10);
    public static final Month DECEMBER = new Month(11);

    private static final Month[] array = {
            JANUARY, FEBRUARY, MARCH, APRIL, MAY, JUNE, JULY, AUGUST, SEPTEMBER, OCTOBER, NOVEMBER, DECEMBER};

    private final int value;

    private Month (int value)
    {
        this.value = value;
    }

    public int ordinal()
    {
        return this.value;
    }

    public static Month[] values()
    {
        return array;
    }
}
