import java.util.Scanner;

public class P137E47b {
    public static Scanner reader = new Scanner(System.in);
    public static void main(String[] args) {
        int in, sum = 0;

        System.out.println("Enter a positive integer: ");
        in = reader.nextInt();
        if (in < 0) {
            System.out.println("Invalid input");
            return;
        }
        for (int i = 2; i <= in; i += 2) {
            System.out.println(i);
            sum += i;
        }
        System.out.println("Sum of even integers is " + sum);
    }
}
