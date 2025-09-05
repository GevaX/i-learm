import java.util.Scanner;

public class P184E8 {
    public static Scanner reader = new Scanner(System.in);
    public static int smallestCommonDivisor(int n1, int n2) {
        int min = Math.min(n1, n2);
        for (int i = 2; i <= min; i++) {
            if (n1 % i == 0 && n2 % i == 0) {
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int n1, n2, c = 0;
        
        System.out.println("Enter 20 number pairs");
        for (int i = 0; i < 20; i++) {
            n1 = reader.nextInt();
            n2 = reader.nextInt();
            if (smallestCommonDivisor(n1, n2) == -1) {
                c++;
            }
        }
        System.out.println("Number of pairs without common divisor is " + c);
    }
}

