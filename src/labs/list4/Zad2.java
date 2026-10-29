package labs.list4;

public class Zad2 {
    public static void main(String[] args) {
        multiplicationTable();
    }

    public static void multiplicationTable() {
        for (int i = 1; i <= 10; i++) {
            System.out.printf("Wiersz %2d: ", i);

            for (int j = 1; j <= 10; j++) {
                int result = i * j;
                if (result > 50) break;
                if (result % 2 == 0) System.out.print(i * j + "\t");
            }
            System.out.println();
        }
    }
}
