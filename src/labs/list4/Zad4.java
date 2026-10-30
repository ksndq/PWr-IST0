package labs.list4;

import java.util.Scanner;

public class Zad4 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Wprowadź poziom sprawności hamulców:");
        int breakLevel = input.nextInt();
        System.out.println("Wprowadź poziom emisji spalin:");
        int emissionLevel = input.nextInt();
        System.out.println("Czy światła są sprawne? (T/N)");
        boolean lightsWorking = "t".equalsIgnoreCase(input.next());

        boolean passesBreakCheck = true;
        boolean passesEmissions = true;
        boolean passesLightTest = true;

        int selectedOption;
        do {
            printMenu();
            selectedOption = input.nextInt();

            switch (selectedOption) {
                case 1 -> passesBreakCheck = performBreakTest(breakLevel);
                case 2 -> passesEmissions = performEmissionTest(emissionLevel);
                case 3 -> passesLightTest = performLightTest(lightsWorking);
            }
        } while (selectedOption != 4);

        printSummary(passesBreakCheck && passesEmissions && passesLightTest, passesBreakCheck, passesLightTest, passesEmissions);
    }

    public static void printMenu() {
        System.out.println("""
                Wybierz opcję:
                1. Test układu hamulcowego
                2. Analiza spalin
                3. Kontrola oświetlenia
                4. Podsumowanie przeglądu""");
    }

    public static boolean performBreakTest(int level) {
        boolean passed = level >= 70;
        printBox(passed ? "Poziom sprawności hamulców prawidłowy!" : "Wykryto za niski poziom sprawności hamulców!");
        return passed;
    }

    public static boolean performEmissionTest(int level) {
        boolean passed = level <= 50;
        printBox(passed ? "Pojazd spełnia normy emisji spalin!" : "Wykryto przekroczenie norm emisji spalin!");
        return passed;
    }

    public static boolean performLightTest(boolean working) {
        printBox(working ? "Oświetlenie pojazdu sprawne!" : "Wykryto niesprawne oświetlenie pojazdu!");
        return working;
    }

    private static void printBox(String text) {
        printBox(text, text.length());
    }

    private static void printBox(String text, int length) {
        String line = "-".repeat(length);
        System.out.printf("%s%n%s%n%s%n", line, text, line);
    }

    private static void printSummary(boolean passed, boolean breaksPassed, boolean lightsPassed, boolean emissionsPassed) {
        String msg = passed
                ? "Pozytywny wynik badania technicznego"
                : "Negatywny wynik badania - pojazd nieodpowiadający wymogom:";
        if (!breaksPassed) {
            msg += "\nWykryto za niski poziom sprawności hamulców!";
        }
        if (!lightsPassed) {
            msg += "\nWykryto niesprawne oświetlenie pojazdu!";
        }
        if (!emissionsPassed) {
            msg += "\nWykryto przekroczenie norm emisji spalin!";
        }
        printBox(msg, 58);
    }
}
