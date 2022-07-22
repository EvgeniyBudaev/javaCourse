package programaniya.Enum;

public class Today {
    WeekDays weekDay;

    public Today(WeekDays weekDay) {
        this.weekDay = weekDay;
    }

    void daysInfo() {
        switch (weekDay) {
            case MONDAY:
            case TUESDAY:
            case WEDNESDAY:
            case THURSDAY:
            case FRIDAY:
                System.out.println("Рабочий день");
                break;
            case SATURDAY:
            case SUNDAY:
                System.out.println("Выходной день");
                break;
            default:
                System.out.println("Нет такого дня");
        }

        System.out.println("Настроение: " + weekDay.getMood());
    }
}
