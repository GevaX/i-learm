import java.util.Scanner;

public class P184E6 {
    public static Scanner reader = new Scanner(System.in);
    public static int numOfEvenDigits(int n) {
        int c = 0;
        while (n != 0) {
            if (n % 10 % 2 == 0) {
                c++;
            }
            n /= 10;
        }
        return c;
    }
    public static void main(String[] args) {
        int n, in, evenDigits, max = 0, maxC = 0;

        System.out.println("Enter n:");
        n = reader.nextInt();
        System.out.println("Enter n integers:");
        for (int i = 0; i < n; i++) {
            in = reader.nextInt();
            evenDigits = numOfEvenDigits(in);
            if (evenDigits > maxC) {
                maxC = evenDigits;
                max = in;
            }
        }
        if (maxC == 0) {
            System.out.println("No number with even digits was entered");
        }
        else {
            System.out.println("Integer with most even digits is " + max);
        }
    }
}
