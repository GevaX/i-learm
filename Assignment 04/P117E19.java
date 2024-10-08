import java.util.Scanner;

public class P117E19 {
    public static Scanner reader = new Scanner(System.in);
    public static void main(String[] args) {
        double currentTemp, previousTemp = 0;

        System.out.println("Enter temperatures for each day of a month");
        for (int i = 1; i <= 30; i++) {
            System.out.printf("Day %d: %n", i);
            currentTemp = reader.nextDouble();

            if (i > 1) {
                if (currentTemp > previousTemp) {
                    System.out.println("The temperature today is higher than yesterday.");
                } else if (currentTemp < previousTemp) {
                    System.out.println("The temperature today is lower than yesterday.");
                } else {
                    System.out.println("The temperature today is the same as yesterday.");
                }
            }
            previousTemp = currentTemp;
        }
    }
}
