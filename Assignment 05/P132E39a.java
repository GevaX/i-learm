import java.util.Scanner;

public class P132E39a {
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
            System.out.printf("%d is a perfect number", n);
        }
        else {
            System.out.printf("%d is not a perfect number", n);
        }
    }
}
