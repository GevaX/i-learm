import java.util.Scanner;

public class P124E25 {
    public static Scanner reader = new Scanner(System.in);
    public static void main(String[] args) {
        int n, trafficSignsMistakes, otherMistakes, c = 0;

        System.out.println("Enter number of test takers: ");
        n = reader.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.printf("Enter number of traffic signs mistakes for test taker %d: ", (i + 1));
            trafficSignsMistakes = reader.nextInt();
            System.out.printf("Enter number of other mistakes for test taker %d: ", (i + 1));
            otherMistakes = reader.nextInt();
            
            if (trafficSignsMistakes == 0 && otherMistakes <= 3) {
                c++;
            }
        }

        if (n > 0) {
            System.out.println("Number of test takers passed: " + c);
            double percentagePassed = (c / (double) n) * 100;
            System.out.printf("Percentage of test takers passed: %.2f%n", percentagePassed);
        } else {
            System.out.println("No test takers.");
        }
    }
}
