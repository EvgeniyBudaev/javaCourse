package yandex.sprint5.Collections.task4;

import java.util.Comparator;

public class DateTimeComparator implements Comparator<DateTime> {

    @Override
    public int compare(DateTime dt1, DateTime dt2) {
        if (dt1.year > dt2.year) {
            return 1;
        } else if (dt1.year < dt2.year) {
            return -1;
        } else {
            if (dt1.month > dt2.month) {
                return 1;
            } else if (dt1.month < dt2.month ) {
                return -1;
            } else {
                if (dt1.day > dt2.day) {
                    return 1;
                } else if (dt1.day < dt2.day) {
                    return -1;
                } else {
                    if (dt1.hours > dt2.hours) {
                        return 1;
                    } else if (dt1.hours < dt2.hours) {
                        return -1;
                    } else {
                        if (dt1.minutes > dt2.minutes) {
                            return 1;
                        } else if (dt1.minutes < dt2.minutes) {
                            return -1;
                        } else {
                            if (dt1.seconds > dt2.seconds) {
                                return 1;
                            } else if (dt1.seconds < dt2.seconds) {
                                return -1;
                            } else {
                                return 0;
                            }
                        }
                    }
                }
            }
        }
    }
}