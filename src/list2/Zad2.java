package list2;

public class Zad2 {

    public static void main(String[] args) {
        int number = -14;

        if (number > 0) {
            if (number % 2 == 0) {
                System.out.println("Liczba jest dodatnia i parzysta.");
            } else {
                System.out.println("Liczba jest dodatnia i nieparzysta.");
            }
        } else if (number < 0) {
            System.out.println("Liczba jest ujemna.");
        } else {
            System.out.println("Liczba to zero.");
        }
    }
}
