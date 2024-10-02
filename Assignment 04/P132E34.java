import java.util.Scanner;

public class P132E34 {
    public static Scanner reader = new Scanner(System.in);
    public static void main(String[] args) {
        int n, mull = 1;
        
        System.out.println("Enter integer: ");
        n = reader.nextInt();
        for (int i = n; i >= 1; i--) {
            mull *= i;
        }
        System.out.printf("%d! = %d", n, mull);
    }
}
