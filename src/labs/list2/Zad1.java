package labs.list2;

public class Zad1 {

    public static void main(String[] args) {
        double gradeOne = 3.5;
        double gradeTwo = 4.5;
        double gradeThree = 5.0;

        System.out.print(decideScholarship(new double[]{gradeOne, gradeTwo, gradeThree}));
    }

    public static String decideScholarship(double[] grades) {
        double averageGrade = 0;
        for (double num: grades) {
            averageGrade += num;
        }
        averageGrade = averageGrade / grades.length;

        if (averageGrade >= 4.5) {
            return "Stypendium przyznane!";
        } else {
            return "Brak Stypendium.";
        }
    }
}