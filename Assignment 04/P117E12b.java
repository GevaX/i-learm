import java.util.Scanner;

public class P117E12b {
    public static Scanner reader = new Scanner(System.in);
    
    public static void main(String[] args) {
        int a, b;
        
        System.out.println("Enter two integers:");
        a = reader.nextInt();
        b = reader.nextInt();
        if (a == b) {
            System.out.println("Invalid input: two integers are equal.");
        } else {
            int min = Math.min(a, b);
            int max = Math.max(a, b);

            System.out.println("Integers in range: ");
            for (int i = min; i <= max; i++) {
                System.out.println(i);
            }
        }
    }
}
