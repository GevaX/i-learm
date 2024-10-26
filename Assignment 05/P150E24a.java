import java.util.Scanner;

public class P150E24a {
    public static Scanner reader = new Scanner(System.in);
    public static void main(String[] args) {
        int n, n1 = 0, n2 = 1, nth;
        System.out.println("Enter a positive integer (n):");
        n = reader.nextInt();

        System.out.printf("Fibonacci sequence till %d: ", n);
        System.out.print(n1);
        while (n2 <= n) {
            System.out.print(", " + n2);
            nth = n1 + n2;
            n1 = n2;
            n2 = nth;
        }
    }
}
// Output for n = 10: 0, 1, 1, 2, 3, 5, 8