import java.util.Scanner;

public class P106E4 {
    public static Scanner reader = new Scanner(System.in);
    public static void main(String[] args) {
        int a, b, c;
        System.out.println("Enter two legs of a triangle: ");
        a = reader.nextInt();
        b = reader.nextInt();

        c = (int) Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
        System.out.println("Hypotenuse is " + c);
    }
}
