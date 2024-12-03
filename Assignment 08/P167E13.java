import java.util.Scanner;

public class P167E13 {
    public static Scanner reader = new Scanner(System.in);
    public static void main(String[] args) {
        int n, min;
        System.out.println("Enter positive integers:");
        n = reader.nextInt();
        while (n >= 100 && n < 1000) {
            min = 9;
            while (n != 0) {
                if (n % 10 < min) {
                    min = n % 10;
                }
                n /= 10;
            }
            System.out.println("Smallest digit is " + min);
            n = reader.nextInt();
        }
    }
}
