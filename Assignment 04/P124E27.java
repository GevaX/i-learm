import java.util.Scanner;

public class P124E27 {
    public static Scanner reader = new Scanner(System.in);
    public static void main(String[] args) {
        int n;
        double n_sqr;

        System.out.println("Enter a positive integer: ");
        n = reader.nextInt();
        n_sqr = Math.sqrt(n);
        for (int i = 2; i <= n_sqr; i++) {
            if (n % i == 0) {
                System.out.println("Not prime number");
                return;
            }
        }
        System.out.println("Prime number");
    }
}
