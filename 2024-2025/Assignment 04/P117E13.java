import java.util.Scanner;

public class P117E13 {
    public static Scanner reader = new Scanner(System.in);
    public static void main(String[] args) {
        int in, digit1, digit2;

        System.out.println("Enter 25 2-digit integers: ");
        for (int i = 0; i < 25; i++) {
            in = reader.nextInt();
            if (in > 99 || in < 10) {
                System.out.println("Invalid input");
                i--;
                continue;
            }
            digit1 = in / 10;
            digit2 = in % 10;
            if (digit1 % 2 == 0 && digit2 % 2 == 0) {
                System.out.println("Two digits are even");
            }
            else if (digit1 % 2 !=0 && digit2 % 2 !=0) {
                System.out.println("Two digits are odd");
            }
            else {
                System.out.println("One digit even and one odd");
            }
        }
    }
}
