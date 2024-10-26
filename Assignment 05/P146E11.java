import java.util.Scanner;

public class P146E11 {
    public static Scanner reader = new Scanner(System.in);
    public static void main(String[] args) {
        int a, b, product, sum = 0;

        int i = 1;
        do { 
            System.out.printf("Enter number pair %d:%n", i);
            a = reader.nextInt();
            b = reader.nextInt();
            product = a * b; 
            System.out.printf("Product (%d * %d): %d%n", a, b, product);
            sum += product;
            i++;
        } while (product != 0);

        System.out.println("Sum of products is " + sum);
        if (0 < sum) {
            System.out.println("Sum of products is positive");
        }
        else if (0 > sum) {
            System.out.println("Sum of products in negative");
        }
        else {
            System.out.println("Sum of products is zero");
        }
    }
}
