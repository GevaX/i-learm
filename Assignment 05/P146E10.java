import java.util.Scanner;

public class P146E10 {
    public static Scanner reader = new Scanner(System.in);
    public static void main(String[] args) {
        char in;
        int yesCount = 0, totalVotes =0;

        System.out.println("Enter answers for survey (y/n/d, end with f):");
        do {
            in = reader.next().charAt(0);
            if (in == 'y') {
                yesCount++;
                totalVotes++;
            }
            else if (in == 'n') {
                totalVotes++;
            }
            else if (in != 'f') {
                System.out.println("Invalid input");
            }
        } while (in != 'f');
        if (totalVotes > 0) {
            double yesPercentage = (double) yesCount / totalVotes * 100;

            if (yesPercentage >= 60) {
                System.out.printf("Reform will be adopted (%.2f%% agreed)", yesPercentage);
            } else {
                System.out.printf("Reform will not be adopted (%.2f%% agreed)", yesPercentage);
            }
        } else {
            System.out.println("No valid votes were cast.");
        }
    }
}
