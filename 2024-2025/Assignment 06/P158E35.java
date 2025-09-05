import java.util.Scanner;

public class P158E35 {
    public static Scanner reader = new Scanner(System.in);
    public static void main(String[] args) {
        int n1, n2, n1d1, n1d2, n2d1, n2d2, c = 0;

        System.out.println("Enter pairs of two-digit numbers: ");
        n1 = reader.nextInt();
        n2 = reader.nextInt();
        while (n1 > 9 && n1 < 100 && n2 > 9 && n2 < 100) {
            n1d1 = n1 / 10;
            n1d2 = n1 % 10;
            n2d1 = n2 / 10;
            n2d2 = n2 % 10;
            if ((n1d1 == n2d1 && n1d2 == n2d2) || (n1d1 == n2d2 && n1d2 == n2d1)) {
                System.out.println("Number pair are similar");
                c++;
            }
            else {
                System.out.println("Number pair are not similar");
            }
            n1 = reader.nextInt();
            n2 = reader.nextInt();
        }
        System.out.println("Number of similar number pairs received: " + c);
    }
}
