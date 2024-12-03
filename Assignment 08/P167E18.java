import java.util.Scanner;

public class P167E18 {
    public static Scanner reader = new Scanner(System.in);

    public static void main(String[] args) {
        int n, prev, c = 1, max = 0;

        System.out.println("Enter one-digit integers (end with -1): ");
        n = reader.nextInt();
        prev = n;
        while (n != -1) {
            n = reader.nextInt();
            if (n != -1) {
                if (n == prev + 1) { // b: if (n == prev + 1 || (prev == 9 && n == 0))
                    c++;
                } else {
                    if (c > max) {
                        max = c;
                    }
                    c = 1;
                }
                prev = n;
            }
        }
        if (c > max) {
            max = c;
        }
        System.out.println("Length of longest following digit sequence is " + max);
    }
}
