import java.util.Scanner;

public class P146E9 {
    public static Scanner reader = new Scanner(System.in);
    public static void main(String[] args) {
        int in, min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;

        System.out.println("Enter grades (enter a negative number to stop):");
        in = reader.nextInt();
        while (in >= 0) { 
            if (max < in) {
                max = in;
            }
            if (min > in) {
                min =  in;
            }
            if (in >= 95) {
                System.out.println("Well done");
            }
            else if (in < 55) {
                System.out.println("Failed");
            }
            in = reader.nextInt();
        }
        if (min != Integer.MAX_VALUE && max != Integer.MIN_VALUE) {
            System.out.println("Lowest grade: " + min);
            System.out.println("Highest grade: " + max);
        } else {
            System.out.println("No valid grades were entered.");
        }
    }
}
