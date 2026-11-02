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

            System.out.printf("Minuty: %d | Pobór: %.1f%% | Stan baterii: %.1f%%%n",
                              gameTime, dischargeRate, Math.max(batteryLevel, 0));
        }

        String breakCause;
        if (batteryLevel <= 0 && gameTime >= 180) {
            breakCause = "poziom baterii spadł do 0% oraz czas trwania symulacji osiągnął 180 minut!";
        } else if (batteryLevel <= 0) {
            breakCause = "poziom baterii spadł do 0%!";
        } else {
            breakCause = "czas trwania symulacji osiągnął 180 minut!";
        }

        System.out.println("Symulacja zakończona: " + breakCause);
    }
}
