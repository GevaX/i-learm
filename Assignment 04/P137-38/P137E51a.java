import java.util.Scanner;

public class P137E51a {
    public static Scanner reader = new Scanner(System.in);
    public static void main(String[] args) {
        int sum = 0;

        System.out.println("Enter number of notebooks for each student: ");
        for (int i = 0; i < 10; i++) {
            sum += reader.nextInt();
        }
        System.out.println("Sum of notebooks is " + sum);
    }
}
