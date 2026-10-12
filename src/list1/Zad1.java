package list1;

public class Zad1 {

    public static void main(String[] args) {
        double gradeOne = 5.0;
        double gradeTwo = 4.5;
        double gradeThree = 5.0;

        System.out.print(decideScholarship(gradeOne, gradeTwo, gradeThree));
    }

    public static String decideScholarship(double gradeOne, double gradeTwo, double gradeThree) {
        double averageGrade = (gradeOne + gradeTwo + gradeThree) / 3;

        if (averageGrade >= 4.5) {
            return "Stypendium przyznane!";
        } else {
            return "Brak Stypendium.";
        }
    }
}