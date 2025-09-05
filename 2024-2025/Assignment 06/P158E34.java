import java.util.Scanner;

public class P158E34 {
    public static Scanner reader = new Scanner(System.in);
    public static void main(String[] args) {
        int n, temp, dig;

        System.out.println("Enter a integer: ");
        n = reader.nextInt();
        System.out.println("Enter a digit: ");
        dig = reader.nextInt();
        boolean digFound = false;
        temp = n;
        while (temp != 0 && !digFound) {
            if (temp % 10 == dig) {
                digFound = true;
            }
            temp /= 10;
        }
        if (digFound) {
            System.out.println("Digit is in the number");
        }
        else {
            System.out.println("Digit is not in the number, new number is " + (n * 10 + dig));
        }
    }
}
