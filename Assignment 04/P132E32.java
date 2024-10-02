import java.util.Scanner;

public class P132E32 {
    public static Scanner reader = new Scanner(System.in);
    public static void main(String[] args) {
        int sum = 0;

        System.out.println("Enter money given by each member");
        for (int i = 0; i < 10; i++) {
            sum += reader.nextInt();
        }
        System.out.println("Sum of collected money: " + sum);
    }
}
