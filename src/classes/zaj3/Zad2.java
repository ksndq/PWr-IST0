package classes.zaj3;

public class Zad2 {
    public static int suma(int liczba) {
        int sum = 0;
        while(liczba > 0) {
            sum += liczba % 10;
            liczba /= 10;
        }
        return sum;
    }
}
