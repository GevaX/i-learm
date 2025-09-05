import java.util.Scanner;

public class P138E55 {
    public static Scanner reader = new Scanner(System.in);
    
    public static void main(String[] args) {
        int n, in, prev = 0, diff = Integer.MAX_VALUE, a = 0, b = 0, med = 0, sum = 0, avg;

        System.out.println("Enter n: ");
        n = reader.nextInt();
        System.out.printf("Enter %d numbers in ascending order: %n", n);
        for (int i = 0; i < n; i++) {
            in = reader.nextInt();
            sum += in;
            if (i > 0) {
                int currentDiff = in - prev;
                if (currentDiff < diff) {
                    diff = currentDiff;
                    a = prev;
                    b = in;
                }
            }
            if (i == n / 2) {
                med = in;
            }
            prev = in;
        }
        avg = sum / n;
        System.out.println("Average of numbers is " + avg);
        System.out.printf("Lowest difference of two numbers is %d (%d, %d)%n", diff, a, b);
        System.out.println("Median of list is " + med);
    }
}
