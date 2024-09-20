import java.util.Scanner;

public class P70E7 {
    public static Scanner reader = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Enter two hights.");
        double h1 = reader.nextDouble();
        double h2 = reader.nextDouble();
        if (h1 < h2) {
            System.out.println("Goes up");
        }
        else {
            System.out.println("Goes down");
        }
    }
}
