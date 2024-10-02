import java.util.Scanner;

public class P117E18 {
    public static Scanner reader = new Scanner(System.in);
    public static void main(String[] args) {
        int a, b, c;
        double avg;

        for (int i = 1; i <= 20; i++) {
            System.out.printf("Enter sum of goals for 3 latest games of player %d: %n", i);
            a = reader.nextInt();
            b = reader.nextInt();
            c = reader.nextInt();
            avg = (a + b + c) / 3.0;

            if (avg == 0) {
                System.out.println("Didn't score");
                continue;
            }
            System.out.printf("Average for player %d is %.2f%n", i, avg);
            if ((a + b + c) >= 5) {
                System.out.println("Outstanding player!");
            }
        }
    }
}