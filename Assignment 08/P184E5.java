import java.util.Scanner;

public class P184E5 {
    public static Scanner reader = new Scanner(System.in);
    public static int randomBetween(int n1, int n2) {
        int min = Math.min(n1, n2);
        int max = Math.max(n1, n2);
        
        int rand = min + (int)(Math.random() * ((max - min) + 1));
        return rand;
    }
    public static void main(String[] args) {
        int n1, n2;
        
        System.out.println("Enter pairs of integers:");
        n1 = reader.nextInt();
        n2 = reader.nextInt();
        while (n1 != -999 || n2 != -999) {
            for (int i = 0; i < 5; i++) {
                System.out.println(randomBetween(n1, n2));
            }
            n1 = reader.nextInt();
            n2 = reader.nextInt();
        }
    }
}
