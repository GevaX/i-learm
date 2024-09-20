import java.util.Scanner;

public class A1E4 {
    public static Scanner reader = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Enter three numbers: ");
        
        int num1 = reader.nextInt();
        int num2 = reader.nextInt();
        int num3 = reader.nextInt();
        
        System.out.println("Sum = " + (num1 + num2 + num3));
    }
}
