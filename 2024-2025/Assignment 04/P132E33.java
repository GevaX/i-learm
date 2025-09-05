import java.util.Scanner;

public class P132E33 {
    public static Scanner reader = new Scanner(System.in);
    public static void main(String[] args) {
        int in, sum = 0;

        System.out.println("Enter 30 numbers: ");
        for (int i = 0; i < 30; i++) {
            in = reader.nextInt();
            if (in > 9 && in < 100 && in % 2 == 0) {
                sum += in;
            }
        }
        System.out.println("Sum of even two digit numbers is " + sum);
    }
}
