import java.util.Scanner;

public class P157E33 {
    public static Scanner reader = new Scanner(System.in);
    public static void main(String[] args) {
        double in, prev;
        int c = 0;

        System.out.println("Enter positive numbers: ");
        in = reader.nextDouble();
        prev = in;
        while (in != 0) {
            if (in >= 0) {
                if (prev > in) {
                    c++;
                }
                prev = in;
            } else {
                System.out.println("Invalid input");
            }
            in = reader.nextDouble();
        }
        System.out.println(c);
    }
}