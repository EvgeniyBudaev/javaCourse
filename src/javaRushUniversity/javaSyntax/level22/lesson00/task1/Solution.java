package javaRushUniversity.javaSyntax.level22.lesson00.task1;

/*
Валидатор даты
*/

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

import static java.util.Arrays.asList;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введи дату в формате dd.mm.yyyy : ");
        String date = scanner.nextLine();
        validateDate(date);
        System.out.println("\nДата корректна.");
    }

    public static void validateDate(String date) {
        try {
            checkDateFormat(date);
            checkYearValue(date);
            checkMonthValue(date);
            checkDayValue(date);
        } catch (InvalidDateFormatException e) {
            throw new RuntimeException(e);
        } catch (InvalidYearValueException e) {
            throw new RuntimeException(e);
        } catch (InvalidMonthValueException e) {
            throw new RuntimeException(e);
        } catch (InvalidDayValueException e) {
            throw new RuntimeException(e);
        }
    }

    public static void checkDateFormat(String date) throws InvalidDateFormatException {
        //напишите тут ваш код
        if (!date.matches("\\d{2}\\.\\d{2}\\.\\d{4}")) {
            throw new InvalidDateFormatException();
        }
    }

    public static void checkYearValue(String date) throws InvalidYearValueException {
        //напишите тут ваш код
        ArrayList<String> array = new ArrayList<>(asList(date.split("\\.")));
        int yyyy = Integer.parseInt(array.get(2));
        if (yyyy < 1900 || yyyy > 2100) {
            throw new InvalidYearValueException();
        }
    }

    public static void checkMonthValue(String date) throws InvalidMonthValueException {
        //напишите тут ваш код
        ArrayList<String> array = new ArrayList<>(asList(date.split("\\.")));
        int mm = Integer.parseInt(array.get(1));
        if (mm < 1 || mm > 12) {
            throw new InvalidMonthValueException();
        }
    }

    public static void checkDayValue(String date) throws InvalidDayValueException {
        HashMap<Integer, Integer> months = new HashMap<>(){{
            put(1, 31);
            put(2, 29);
            put(3, 31);
            put(4, 30);
            put(5, 31);
            put(6, 30);
            put(7, 31);
            put(8, 31);
            put(9, 30);
            put(10, 31);
            put(11, 30);
            put(12, 31);
        }};
        //напишите тут ваш код
        ArrayList<String> array = new ArrayList<>(asList(date.split("\\.")));
        int dd = Integer.parseInt(array.get(0));
        int mm = Integer.parseInt(array.get(1));
        if (dd < 1 || dd > months.get(mm)) {
            throw new InvalidDayValueException();
        }
    }
}
