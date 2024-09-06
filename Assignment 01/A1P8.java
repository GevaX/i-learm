import java.util.Scanner;

public class A1P8 {
    public static Scanner reader = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Enter two numbers (x,y): ");
        int x = reader.nextInt();
        int y = reader.nextInt();

        System.out.println("Before Swap");
        System.out.println("x = " + x + ", y = " + y);

        //XOR swap
        x ^= y;
        y ^= x;
        x ^= y;

        System.out.println("After Swap");
        System.out.println("x = " + x + ", y = " + y);
    }
}
