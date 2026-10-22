package labs.list2;

public class Zad3 {
    public static void main(String[] args) {
        int year = 2024;

        if (isLeapYear(year)) {
            System.out.printf("Luty w roku %s ma 29 dni.", year);
        } else {
            System.out.printf("Luty w roku %s ma 28 dni.", year);
        }
    }

    public static boolean isLeapYear(int year) {
        return ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0);
    }
}
