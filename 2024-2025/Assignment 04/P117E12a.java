import java.util.Scanner;

public class P117E12a {
    public static Scanner reader = new Scanner(System.in);
    public static void main(String[] args) {
        int a,b;
        
        System.out.println("Enter two integers: ");
        a = reader.nextInt();
        b = reader.nextInt();
        System.out.println("Integers in range: ");
        for (int i = a; i <= b; i++) {
            System.out.println(i);
        }
    }
}
