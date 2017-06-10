package com.aca.salon.model.enums;

/**
 * Created by Armine on 29/05/2017.
 */
public enum WeekDay {
    SUNDAY(1),
    MONDAY(2),
    TUESDAY(3),
    WEDNESDAY(4),
    THURSDAY(5),
    FRIDAY(6),
    SATURDAY(7);

    WeekDay(int dayOfWeek) {
        this.dayOfWeek = dayOfWeek;
    }

    private int dayOfWeek;

    public int getDayOfWeek() {
        return dayOfWeek;
    }

    public static WeekDay getWeekDay(int dayOfWeek) {
        switch (dayOfWeek) {
            case 1:
                return SUNDAY;
            case 2:
                return MONDAY;
            case 3:
                return TUESDAY;
            case 4:
                return WEDNESDAY;
            case 5:
                return THURSDAY;
            case 6:
                return FRIDAY;
            case 7:
                return SATURDAY;
            default:
                return null;
        }
    }


}
