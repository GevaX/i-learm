import java.util.Scanner;

public class P132E36_copy {
    public static Scanner reader = new Scanner(System.in);
    public static void main(String[] args) {
        int a, b, sum = 0, mull = 1;

        System.out.println("Enter 2 integers: ");
        a = reader.nextInt();
        b = reader.nextInt();
        for (int i = a; i <= b; i++) {
            sum += i;
            mull *= i;
        }
        System.out.println("Sum of numbers in range is " + sum);
        System.out.println("Multiplication of numbers in range is " + mull);
    }
}
