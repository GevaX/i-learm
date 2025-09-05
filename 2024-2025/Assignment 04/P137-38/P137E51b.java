import java.util.Scanner;

public class P137E51b {
    public static Scanner reader = new Scanner(System.in);
    public static void main(String[] args) {
        int sum = 0, price;

        System.out.println("Enter price of notebook: ");
        price = reader.nextInt();
        System.out.println("Enter number of notebooks for each student: ");
        for (int i = 0; i < 10; i++) {
            sum += reader.nextInt();
        }
        System.out.println("Sum of notebooks is " + sum);
        System.out.println("Price of all notebooks is " + (price * sum));
    }
}
