package list3;

public class Zad2 {
    public static void main(String[] args) {
        int points = 90;
        int presence = 80;

        System.out.println(hasPassed(points, presence));
    }

    public static String hasPassed(int points, int presence) {
        if (presence < 80) {
            return "Brak zaliczenia z powodu zbyt niskiej frekwencji!";
        }
        String finalGrade = switch (points) {
            case Integer i when i >= 90 -> "5.0";
            case Integer i when i >= 80 -> "4.5";
            case Integer i when i >= 70 -> "4.0";
            case Integer i when i >= 60 -> "3.5";
            case Integer i when i >= 50 -> "3.0";
            default -> "2.0 (Brak zaliczenia)";
        };
        return String.format("Ocena %s", finalGrade);
    }
}
