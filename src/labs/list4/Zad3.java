package labs.list4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Zad3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        analyzeNumber(input.nextLong());
    }

    public static void analyzeNumber(long number) {
        List<Integer> evenDigits = new ArrayList<>();
        List<Integer> unevenDigits = new ArrayList<>();
        int evenSum = 0;
        long unevenProduct = 1;
        int zeros = 0;
        int biggerThanFive = 0;
        boolean hasSeven = false;

        long temp = Math.abs(number);
        while (temp > 0) {
            int digit = (int) (temp % 10);

            if (digit % 2 == 0) {
                evenDigits.add(digit);
                evenSum += digit;
                if (digit == 0) zeros++;
            } else {
                unevenDigits.add(digit);
                unevenProduct *= digit;
            }

            if (digit >= 5) biggerThanFive++;
            if (digit == 7) hasSeven = true;
            temp /= 10;
        }
        evenDigits = evenDigits.reversed();

        System.out.println("Analizowana liczba: " + number);

        String sumLine = "(" + String.join(" + ", evenDigits.stream().map(Object::toString).toList()) + ")";
        System.out.printf("Suma cyfr parzystych %s: %s%n", sumLine, evenSum);

        String multiplicationLine = "(" + String.join(" * ", unevenDigits.stream().map(Object::toString).toList()) + ")";
        System.out.printf("Iloczyn cyfr nieparzystych %s: %s%n", multiplicationLine, unevenProduct);

        System.out.printf("Liczba zer: %s | Cyfry >= 5: %s | Czy zawiera cyfrę 7: %s", zeros, biggerThanFive, hasSeven);
    }
}
