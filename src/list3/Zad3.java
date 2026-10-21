package list3;

public class Zad3 {
    public static void main(String[] args) {
        logLumbers(20);
    }

    public static void logLumbers(int n) {
        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.printf("Liczba: %s (podzielna przez 3 i 5)%n", i);
            } else if (i % 3 == 0 || i % 5 == 0) {
                System.out.printf("Liczba: %s%n", i);
            }
        }
    }
}