import java.util.Scanner;

public class P71E14 {
    public static Scanner reader = new Scanner(System.in);

    public static void main(String[] args) {
        int num, firstDigit, lastDigit;
        System.out.print("Enter a 3-digit number: ");
        num = reader.nextInt();

        if (num < 100 || num > 999) {
            System.out.println("Invalid input.");
        } else {
            lastDigit = num % 10;
            firstDigit = num / 100;

            if (firstDigit == lastDigit) {
                System.out.println("The number is a palindrome.");
            } 
            else {
                System.out.println("The number isn't a palindrome.");
            }
        }
    }
}