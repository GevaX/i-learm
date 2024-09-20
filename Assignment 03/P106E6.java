import java.util.Scanner;

public class P106E6 {
    public static Scanner reader = new Scanner(System.in);
    public static void main(String[] args) {
        double a, b, c, perimeter, surface, p;
        System.out.println("Enter three sides of a triangle: ");
        a = reader.nextDouble();
        b = reader.nextDouble();
        c = reader.nextDouble();

        perimeter = a + b + c;

        p = perimeter / 2;
        surface = Math.sqrt(p*(p-a)*(p-b)*(p-c));

        System.out.println("Perimeter is " + perimeter);
        System.out.println("Surface is " + surface);
    }
}
