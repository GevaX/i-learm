import java.util.Scanner;

public class P150E23 {
    public static Scanner reader = new Scanner(System.in);
    public static void main(String[] args) {
        int n, dig, rn = 0;

        System.out.println("Enter an integer: ");
        n = reader.nextInt();
        while (n != 0) {
            dig = n % 10;
            rn = rn * 10 + dig;
            n /= 10;
        }
        System.out.println("Reversed integer is " + rn);
    }
}
