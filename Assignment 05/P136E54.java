import java.util.Scanner;

public class P136E54 {
    public static Scanner reader = new Scanner(System.in);
    public static void main(String[] args) {
        int n, c8 = 0, c9 = 0, c10 = 0, sum = 0, max = 0, rand;
        double avg;

        System.out.println("Enter a positive integer: ");
        n = reader.nextInt();
        for (int i = 0; i < n; i++) {
            rand = 8 + (int)(Math.random() * ((10 - 8) + 1));
            System.out.print(rand + ", ");
            if (rand == 8) {
                c8++;
            }
            else if (rand == 9) {
                c9++;
            }
            else {
                c10++;
            }
            sum += rand;
            if (max < rand) {
                max = rand;
            }
        }
        avg = (double) sum / n;
        System.out.println();
        if (c8 > c9 && c8 > c10) {
            System.out.println("Most drawn number is 8");
        }
        else if (c9 > c8 && c9 > c10) {
            System.out.println("Most drawn number is 9");
        }
        else {
            System.out.println("Most drawn number is 10");
        }
        System.out.println("Average of drawn numbers is " + avg);
        System.out.println("Largest number drawn is " + max);
    }
}
