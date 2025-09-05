import java.util.Scanner;

public class P71E13 {
    public static Scanner reader = new Scanner(System.in);
    public static void main(String[] args) {
        int a, b, c;
        System.out.println("Enter three numbers: ");
        a = reader.nextInt();
        b = reader.nextInt();
        c = reader.nextInt();
        if ((a - b) == (b - c)) {
            System.out.println("Arithmetic sequence");
        }
        else {
            System.out.println("Not arithmetic sequence");
        }
    }
}
