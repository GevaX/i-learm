import java.util.Scanner;

public class A1P5 {
    public static Scanner reader = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Enter age: ");
        int age = reader.nextInt();
        System.out.println("Days: " + age * 365 + "\nHours: " + age * 365 * 24);
    }
}
