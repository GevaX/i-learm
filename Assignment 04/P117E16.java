import java.util.Scanner;

public class P117E16 {
    public static Scanner reader = new Scanner(System.in);

    public static void main(String[] args) {
        int a, b, na ,nb;
        System.out.println("Enter 35 number pairs: ");
        
        for (int i = 1; i <= 35; i++) {
            System.out.printf("Pair %d (enter two integers separated by space): ", i);
            a = reader.nextInt();
            b = reader.nextInt();
            if (a == b) {
                System.out.println("Invalid input, enter two different numbers");
                i--;
                continue;
            }
            na = (a < b) ? a + 1 : b + 1;
            nb = (a > b) ? a - 1 : b - 1;

            System.out.printf("New pair: %d, %d%n", na, nb);
        }
    }
}
