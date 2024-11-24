import java.util.Scanner;

public class P165E6 {
    public static Scanner reader = new Scanner(System.in);
    public static void main(String[] args) {
        for (int i = 1; i <= 6; i++) {
            for (int j = 1; j <= 6; j++) {
                System.out.printf("(%d,%d)", i, j);
            }
        }
    }
}
