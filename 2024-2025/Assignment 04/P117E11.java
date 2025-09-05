import java.util.Scanner;

public class P117E11 {
    public static Scanner reader = new Scanner(System.in);
    public static void main(String[] args) {
        int in;

        System.out.println("Enter 50 3-digit integers: ");
        for (int i = 0; i < 50; i++) {
            in = reader.nextInt();
            if (in < 100 || in > 999) {
                System.out.println("Invalid input");
                i--;
                continue;
            }

            int digit1 = in / 100;
            int digit2 = (in / 10) % 10;
            int digit3 = in % 10;
            if ((digit1 != digit2) && (digit1 != digit3) && (digit2 != digit3)) {
                System.out.println("Digits are unique");
            }
            else {
                System.out.println("Digits are not unique");
            }
        }
    }
}
