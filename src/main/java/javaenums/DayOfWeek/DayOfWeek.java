package javaenums.DayOfWeek;

public enum DayOfWeek {
    SUNDAY(1),
    MONDAY(2),
    TUESDAY(3),
    WEDNESDAY(4),
    THURSDAY(5),
    FRIDAY(6),
    SATURDAY(7);

    private final int dayNumber;

    DayOfWeek(int dayNumber) {
        this.dayNumber = dayNumber;
    }

    public int getDayNumber() {
        return dayNumber;
    }

    /**
     * returning day of week
     * @param dayOfWeek
     * @return
     */

    public static int getDayNumber(DayOfWeek dayOfWeek) {
        return dayOfWeek.getDayNumber();
    }

}
