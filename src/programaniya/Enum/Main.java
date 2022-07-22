package programaniya.Enum;

/* enum - это способ ограничения определенного рода информации конкретным списком возможных вариантов */
/* Конструктор в enum имеет access modifier private и не нуждается во внешнем вызове */
/* enum является дочерним классом для java.lang.Enum */
/* Часто используемые методы valueOf, values */

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Today today = new Today(WeekDays.MONDAY);
        today.daysInfo(); // Рабочий день

        WeekDays weekDays = WeekDays.FRIDAY;
        System.out.println(weekDays); // FRIDAY

        System.out.println(today.weekDay); // MONDAY

        // valueOf позволяет создать enum из какого-то значения, но это значение должно быть полность верным иначе error
        WeekDays w15 = WeekDays.valueOf("MONDAY");
        System.out.println(w15); // MONDAY

        // values - возвращает массив констант, которые принадлежат enum
        WeekDays[] array = WeekDays.values();
        System.out.println(Arrays.toString(array)); // [MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY]
    }
}
