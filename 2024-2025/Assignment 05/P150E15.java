import java.util.Scanner;

public class P150E15 {
    public static Scanner reader = new Scanner(System.in);
    public static void main(String[] args) {
        int n, digit, digCount = 0, digSum = 0, digMul = 1;

        System.out.println("Enter a number: ");
        n = reader.nextInt();
        if (n == 0) {
            digCount = 1;
        }
        while (n != 0) {
            digit = n % 10;
            digSum += digit;
            digMul *= digit;
            digCount++;
            n /= 10;
        }
        System.out.println("Number of digits is " + digCount);
        System.out.println("Sum of digits is " + digSum);
        System.out.println("Product of digits is " + digMul);
    }
}
