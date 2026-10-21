package list3;

public class Zad4 {
    public static void main(String[] args) {
        double accountBalance = 2000.0;
        double payoutAmount = 1200.0;
        int pinEntered = 1234;
        int correctPin = 1234;
        boolean isCardBlocked = false;

        accountBalance = executeTransaction(accountBalance,payoutAmount,pinEntered,correctPin,isCardBlocked);
    }

    public static double executeTransaction(
            double accountBalance,
            double payoutAmount,
            int pinEntered,
            int correctPin,
            boolean isCardBlocked
    ) {
        boolean transactionCancelled = false;
        if (isCardBlocked) {
            System.out.println("Błąd: Karta jest zablokowana!");
            transactionCancelled = true;
        }
        if (pinEntered != correctPin) {
            System.out.println("Błąd: Niepoprawny PIN!");
            transactionCancelled = true;
        }
        if (payoutAmount > accountBalance) {
            System.out.println("Błąd: Brak wystarczających środków na koncie!");
            transactionCancelled = true;
        }
        if (!transactionCancelled) {
            double newBalance = accountBalance - payoutAmount;
            System.out.printf("Transakcja zrealizowana pomyślnie. Nowe saldo: %s zł.%n", newBalance);
            return newBalance;
        }
        return accountBalance;
    }
}
