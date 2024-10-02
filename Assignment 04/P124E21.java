import java.util.Scanner;

public class P124E21 {
    public static Scanner reader = new Scanner(System.in);
    public static void main(String[] args) {
        int in, c = 0;

        System.out.println("Enter 8 positive integers: ");
        for (int i = 0; i < 8; i++) {
            in = reader.nextInt();
            if (in < 0) {
                System.out.println("Invalid input");
                i--;
                continue;
            }
            if (in % 2 == 0) {
                c++;
            }
        }
        System.out.println("Number of even integers is " + c);
    }
}
