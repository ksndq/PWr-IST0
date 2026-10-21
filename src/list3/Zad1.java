package list3;

public class Zad1 {
    public static void main(String[] args) {
        double monthlyIncome = 4500.0;
        double installmentAmount = 1200.0;
        boolean existingLiabilities = false;

        System.out.println(eligibleForLoan(monthlyIncome, installmentAmount, existingLiabilities));
    }

    public static String eligibleForLoan(double monthlyIncome, double installmentAmount, boolean existingLiabilities) {
        if (installmentAmount <= monthlyIncome * 0.4 && !existingLiabilities) {
            return "Wniosek kredytowy zatwierdzony.";
        }
        return "Wniosek kredytowy odrzucony.";
    }
}
