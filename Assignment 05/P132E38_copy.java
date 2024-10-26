import java.util.Scanner;

public class P132E38_copy {
    public static Scanner reader = new Scanner(System.in);
    public static void main(String[] args) {
        int base, exponent, res = 1;

        System.out.println("Enter base: ");
        base = reader.nextInt();
        System.out.println("Enter exponent: ");
        exponent = reader.nextInt();
        if (base < 0 || exponent < 0) {
            System.out.println("Invalid input");
            return;
        }
        for (int i = 0; i < exponent; i++) {
            res *= base;
        }
        System.out.printf("%d^%d = %d", base, exponent, res);
    }
}
