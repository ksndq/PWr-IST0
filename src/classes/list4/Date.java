package classes.list4;

public class Date {
    private int year;
    private int month;
    private int day;

    public Date() {
        this.year = 2026;
        this.month = 10;
        this.day = 28;
    }

    public Date(int year, int month, int day) {
        if (isDateCorrect(year, month, day)) {
            this.year = year;
            this.month = month;
            this.day = day;
        } else {

        }
    }

    public int getYear() {
        return this.year;
    }

    public void setYear(int year) {
        if (isDateCorrect(year, this.month, this.day)) {
            this.year = year;
        }
    }

    public int getMonth() {
        return this.month;
    }

    public void setMonth(int month) {
        if (isDateCorrect(this.year, month, this.day)) {
            this.month = month;
        }
    }

    public int getDay() {
        return this.day;
    }

    public void setDay(int day) {
        if (isDateCorrect(this.year, this.month, day)) {
            this.day = day;
        }
    }

    public void setDate(int year, int month, int day) {
        if (isDateCorrect(year, month, day)) {
            this.year = year;
            this.month = month;
            this.day = day;
        }
    }

    static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    public boolean isLeapYear() {
        return isLeapYear(this.year);
    }

    static int getMonthDays(int month, int year) {
        return switch (month) {
            case 4, 6, 9, 11 -> 30;
            case 2 -> isLeapYear(year) ? 29 : 28;
            default -> {
                if (month > 0 && month <= 12) {
                    yield 31;
                }
                yield 0;
            }
        };
    }

    public int getMonthDays() {
        return getMonthDays(this.month, this.year);
    }

    static boolean isDateCorrect(int year, int month, int day) {
        if (year < 1 || month < 1 || month > 12) {
            return false;
        }
        int maxDays = getMonthDays(month, day);
        return day >= 1 && day <= maxDays;
    }

    static int getYearDays(int year) {
        return isLeapYear(year) ? 366 : 365;
    }

    public int getYearDays() {
        return getYearDays(this.year);
    }

    static int whatDayOfTheYear(int year, int month, int day) {
        int days = day;
        for (int i = 1; i < month; i++) {
            days += getMonthDays(i, year);
        }
        return days;
    }

    public int whatDayOfTheYear() {
        return whatDayOfTheYear(this.year, this.month, this.day);
    }

    static String getFormattedDate(int year, int month, int day) {
        return String.format("%02d.%02d.%04d", day, month, year);
    }

    @Override
    public String toString() {
        return getFormattedDate(this.year, this.month, this.day);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Date date = (Date) obj;
        return day == date.day && month == date.month && year == date.year;
    }
}
