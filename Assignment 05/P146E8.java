import java.util.Scanner;

public class P146E8 {
    public static Scanner reader = new Scanner(System.in);
    public static void main(String[] args) {
        int in, c = 0;

        System.out.println("Enter positive integers (enter a negative number to stop):");
        in = reader.nextInt();
        while (in > 0) { 
            c++;
            in = reader.nextInt();
        }
        System.out.println("Number of positive integers entered is " + c);
    }
}
