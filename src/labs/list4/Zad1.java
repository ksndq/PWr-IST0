package labs.list4;

public class Zad1 {
    public static void main(String[] args) {
        simulateBatteryLoss();
    }

    public static void simulateBatteryLoss() {
        double batteryLevel = 100.0;
        int gameTime = 0;

        while (batteryLevel > 0 && gameTime < 180) {
            double dischargeRate = (gameTime < 60) ? 12.5 : 7.0;
            batteryLevel -= dischargeRate;
            gameTime += 15;

            System.out.printf("Minuty: %d | Pobór: %s%% | Stan baterii: %s%%%n", gameTime, dischargeRate, batteryLevel);
        }
        String breakCause;
        if (batteryLevel <= 0) {
            if (gameTime >= 180) {
                breakCause = "poziom baterri spadł poniżej 0% oraz czas trwania symulacji przekroczył 180 minut!";
            } else {
                breakCause = "poziom baterii spadł poniżej 0%!";
            }
        } else {
            breakCause = "czas trwania przekroczył 180 minut!";
        }

        System.out.println("Symulacja zakończona: " + breakCause);
    }
}
