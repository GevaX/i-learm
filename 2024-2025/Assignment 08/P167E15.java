import java.util.Scanner;

public class P167E15 {
    public static Scanner reader = new Scanner(System.in);

    public static void main(String[] args) {
        int n, c = 0;
        boolean prime;

        System.out.println("Enter 30 numbers:");
        for (int i = 0; i < 30; i++) {
            n = reader.nextInt();
            prime = true;
            if (n <= 1) {
                prime = false;
            } else {
                for (int j = 2; j <= Math.sqrt(n); j++) {
                    if (n % j == 0) {
                        prime = false;
                    }
                }
            }
            if (prime) {
                c++;
            }
        }
        System.out.println(c + " prime numbers were entered");
    }
}
