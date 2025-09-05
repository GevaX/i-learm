import java.util.Scanner;

public class P132E39b {
    public static Scanner reader = new Scanner(System.in);
    public static void main(String[] args) {
        int n, sumOfDivisors = 1;
        double n_sqr;

        System.out.println("Enter a positive integer: ");
        n = reader.nextInt();
        if (n == 1) {
            System.out.println("1 is not a perfect number");
            return;
        }
        n_sqr = Math.sqrt(n);
        for (int i = 2; i <= n_sqr; i++) {
            if (n % i == 0) {
                sumOfDivisors += i;
                if (i != n / i) {
                    sumOfDivisors += n / i;
                }
            }
        }
        if (sumOfDivisors == n) {
            System.out.printf("%d is a perfect number: %d = 1", n, n);
            for (int i = 2; i <= n / 2; i++) {
                if (n % i == 0) {
                    System.out.print(" + " + i);
                }
            }
        }
        else {
            System.out.printf("%d is not a perfect number", n);
        }
    }
}