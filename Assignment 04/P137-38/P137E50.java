import java.util.Scanner;

public class P137E50 {
    public static Scanner reader = new Scanner(System.in);
    public static void main(String[] args) {
        int n, sum = 0;

        System.out.println("Enter positive integer: ");
        n = reader.nextInt();
        if (n < 0) {
            System.out.println("Invalid input");
            return;
        }
        for (int i = 1; i <= n; i++){
            sum += i;
        }
        System.out.printf("Sum of all integers between 1 and %d is %d", n, sum);
    }
}
