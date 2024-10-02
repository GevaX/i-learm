import java.util.Scanner;

public class P117E15b {
    public static Scanner reader = new Scanner(System.in);
    public static void main(String[] args) {
        int num, in, sum;

        System.out.println("Enter num: ");
        num = reader.nextInt();
        System.out.printf("Enter %d positive 2 digit integers: %n", num);
        for (int i = 0; i < num; i++) {
            in = reader.nextInt();
            if (in > 99 || in < 10 || in < 0) {
                System.out.println("Invalid input");
                i--;
                continue;
            }
            
            if ((in / 10) != (in % 10)) {
                sum = in / 10 + in % 10;
                System.out.printf("Sum of the digits of the number %d is %d%n", in, sum);
            }
            else {
                System.out.println("Digits are not unique");
            }
        }
    }
}
