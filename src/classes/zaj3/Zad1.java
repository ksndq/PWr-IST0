package classes.zaj3;

public class Zad1 {
    public static void main(String[] args) {
              //ax^2+bx+c=0
        //x(ax+b)
        calculate(1, 4, 3);
    }

    public static void calculate(double a, double b, double c) {
        if (a == 0) {
            if (b == 0) {
                if (c == 0) {
                    System.out.println("Tożsamościowe");
                    return;
                }
                System.out.println("Sprzeczne");
            }
        }

        double delta = b * b - 4 * a * c;
        if (delta == 0) {
            System.out.println(-b/2*a);
        } else if (delta > 0) {
            System.out.println((-b + Math.sqrt(delta)) / 2 * a);
            System.out.println((-b - Math.sqrt(delta)) / 2 * a);
        } else {
            System.out.println("Brak rozwiązań");
        }
    }
}
