import java.util.Scanner;

public class P137E47a {
    public static Scanner reader = new Scanner(System.in);
    public static void main(String[] args) {
        int in;

        System.out.println("Enter a positive integer: ");
        in = reader.nextInt();
        if (in < 0) {
            System.out.println("Invalid input");
            return;
        }
        for (int i = 2; i <= in; i += 2) {
            System.out.println(i);
        }
    }
}
