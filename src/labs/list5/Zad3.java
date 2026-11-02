package labs.list5;

import java.util.Scanner;

public class Zad3 {

    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        int n = input.nextInt();

        while (n % 2 == 0 || n <= 2) {
            System.out.println("Wprowadzona liczba musi być nieparzysta i większa od 1!");
            n = input.nextInt();
        }

        for (int i = 0; i < n; i++) {
            System.out.println(getHourglassRow(n, i));
        }
    }


    public static String getHourglassRow(int n, int rowIndex) {
        int numberOfStars;
        int numberOfSpaces = (rowIndex > n / 2) ? n - 1 - rowIndex : rowIndex;
        numberOfStars = n - 2 * numberOfSpaces;
        return " ".repeat(numberOfSpaces) + "*".repeat(numberOfStars) + " ".repeat(numberOfSpaces);
    }
}
