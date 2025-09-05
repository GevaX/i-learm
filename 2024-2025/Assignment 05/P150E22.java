import java.util.Scanner;

public class P150E22 {
    public static Scanner reader = new Scanner(System.in);
    public static void main(String[] args) {
        int a, b, count = 0, sum, largestSum = Integer.MIN_VALUE, maxA = 0, maxB = 0;

        System.out.println("Enter a number pair: ");
        a = reader.nextInt();
        b = reader.nextInt();
        while (!((a % 2 == 0 && b % 2 != 0) || (a % 2 != 0 && b % 2 == 0))) {
            sum = a + b;
            if (largestSum < sum) {
                largestSum = sum;
                maxA = a;
                maxB = b;
            }
            count++;
            System.out.println("Enter a number pair: ");
            a = reader.nextInt();
            b = reader.nextInt();
        }
        
        System.out.println("Number of pairs received is " + count);
        System.out.printf("The pair with the largest sum is (%d, %d) with sum of %d", maxA, maxB, largestSum);
    }
}