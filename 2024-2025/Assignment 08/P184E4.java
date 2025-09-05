import java.util.Scanner;

public class P184E4 {
    public static Scanner reader = new Scanner(System.in);
    public static int numOfShows(int n, int dig) {
        int c = 0;
        while (n != 0) {
            if (n % 10 == dig) {
                c++;
            }
            n /= 10;
        }
        return c;
    }
}
