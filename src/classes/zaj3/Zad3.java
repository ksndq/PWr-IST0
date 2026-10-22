package classes.zaj3;

public class Zad3 {
    public static void main(String[] args) {
        calc(1, 1000);
    }

    public static void calc(int a, int b) {
        int linesOut = 0;
        for (int i = a; i < b; i++) {
            int wynik = Zad2.suma(i);
            if (wynik == 20) {
                linesOut++;
                System.out.print(i + " ");
                if (linesOut % 20 == 0) {
                    System.out.println();
                }
            }
        }
    }
}
