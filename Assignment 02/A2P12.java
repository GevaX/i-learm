import java.util.Scanner;

public class A2P12 {
    public static Scanner reader = new Scanner(System.in);
    public static void main(String[] args) {
        double x, y;
        char operation;
        System.out.println("Enter two numbers: ");
        x = reader.nextDouble();
        y = reader.nextDouble();

        System.out.println("Enter math operation (+,-,/,*): ");
        operation = reader.next().charAt(0);

        switch (operation) {
            case '+' -> System.out.println("x + y = " + (x + y));
            case '-' -> System.out.println("x - y = " + (x - y));
            case '/' -> {
                if (y != 0) {
                    System.out.println("x / y = " + (x / y));
                } else {
                    System.out.println("Error: Division by zero is not allowed.");
                }
            }
            case '*' -> System.out.println("x * y = " + (x * y));
            default -> System.out.println("Error: Invalid operation.");
        }
    }
}
