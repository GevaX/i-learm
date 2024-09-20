import java.util.Scanner;

public class P80E29 {
    public static Scanner reader = new Scanner(System.in);
    public static void main(String[] args) {
        int a,b,c;
        System.out.println("Enter three integers: ");
        a = reader.nextInt();
        b = reader.nextInt();
        c = reader.nextInt();

        if(Math.pow(a, 2) + Math.pow(b, 2) == Math.pow(c, 2)) {
            System.out.println("Pythagorean triple");
        }
        else {
            System.out.println("Not a pythagorean triple");
        }
    }
}