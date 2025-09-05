import java.util.Scanner;

public class P80E31 {
    public static Scanner reader = new Scanner(System.in);
    public static void main(String[] args) {
        double a, b, c;
        System.out.println("Enter three lengths of sides: ");
        a = reader.nextDouble();
        b = reader.nextDouble();
        c = reader.nextDouble();

        if (a + b > c && a + c > b && b + c > a) {
            System.out.println("The sides form a valid triangle");
        }
        else {
            System.out.println("The sides do not form a valid triangle");
        }
    }
}