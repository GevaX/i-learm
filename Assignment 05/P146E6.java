import java.util.Scanner;

public class P146E6 {
    public static Scanner reader = new Scanner(System.in);
    public static void main(String[] args) {
        int in, tens, units, largestDistinct = -1;

        System.out.println("Enter two-digit integers (enter -1 to stop):");
        in = reader.nextInt();
        while (in != -1) {
            if (in >= 10 && in <= 99) {
                tens = in / 10;
                units = in % 10;
                if (tens != units && in > largestDistinct) {
                    largestDistinct = in;
                }
            }
            else {
                System.out.println("Invalid input");
            }
            in = reader.nextInt();
        }
        if (largestDistinct != -1) {
            System.out.println("The largest two-digit number with different digits is: " + largestDistinct);
        }
        else {
            System.out.println("No valid number with distinct digits was entered.");
        }
    }
}
