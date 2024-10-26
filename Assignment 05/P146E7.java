import java.util.Scanner;

public class P146E7 {
    public static Scanner reader = new Scanner(System.in);
    public static void main(String[] args) {
        int in, mul = 1;

        System.out.println("Enter positive integers (enter -1 to stop):");
        in = reader.nextInt();
        while (in != -1) { 
            if (in > 0) {
                if (in % 2 == 0 && in % 3 == 0) {
                    mul *= in;
                }
            }
            else {
                System.out.println("Invalid input");
            }
            in = reader.nextInt();
        }
        if (mul != 1) {
            System.out.println("Multiplication of all numbers that are divisible by 2 and 3 in the series is " + mul);
        }
        else {
            System.out.println("No integers that are divisible by 2 and 3 were entered");
        }
    }
}
