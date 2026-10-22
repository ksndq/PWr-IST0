package labs.list2;

public class Zad4 {
    public static void main(String[] args) {
        int a = 5;
        int b = 5;
        int c = 8;

        if (isValidTriangle(a, b, c)) {
            System.out.println(categoriseTriangle(a, b, c));
        } else {
            System.out.println("Z podanych boków nie można zbudować trójkąta!");
        }
    }

    public static boolean isValidTriangle(int a, int b, int c) {
        return a > 0 && b > 0 && c > 0 && a + b > c && a + c > b && b + c > a;
    }

    public static String categoriseTriangle(int a, int b, int c) {
        if (a == b && b == c) {
            return "Trójkąt równoboczny";
        }
        if (a == b || b == c || a == c) {
            return "Trójkąt równoramienny";
        }
        return "Trójkąt różnoboczny";
    }
}
