import java.util.Scanner;

public class P192E17 {
    public static Scanner reader = new Scanner(System.in);
    public static void whereDigit(int n, int dig) {
        int c = 1;
        boolean isIt = false;

        while (n != 0) {
            if (n % 10 == dig) {
                System.out.print(c + " ");
                isIt = true;
            }
            n /= 10;
            c++;
        }
        if (!(isIt)) {
            System.out.print("0");
        }
    }

    public static void main(String[] args) {
        int num;

        System.out.println("Enter a positive integer: ");
        num = reader.nextInt();
        for (int i = 0; i <= 9; i++) {
            System.out.print(i + ": ");
            whereDigit(num, i);
            System.out.println();
        }
    }
}
