package labs.list5;

public class Zad1 {
    public static void main(String[] args) {
        int[] measurements = {14, -3, 25, 42, -8, 7, 19, 31, -12, 25};

        int min = measurements[0];
        int max = measurements[0];
        double sum = 0;

        for (int m : measurements) {
            if (m < min) min = m;
            if (m > max) max = m;
            sum += m;
        }
        double average = sum / measurements.length;
        int biggerOrEqual = 0;
        int smaller = 0;

        for (int m : measurements) {
            if (m >= average) {
                biggerOrEqual++;
            } else {
                smaller++;
            }
        }

        System.out.println("Najmniejszy pomiar: " + min);
        System.out.println("Największy pomiar: " + max);
        System.out.println("Średnia arytmetyczna pomiarów: " + average);
        System.out.println("Pomiary większe lub równe średniej: " + biggerOrEqual);
        System.out.println("Pomiary mniejsze od średniej: " + smaller);
    }
}
