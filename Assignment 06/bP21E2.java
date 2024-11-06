import java.util.Scanner;

public class bP21E2 {
    public static Scanner reader = new Scanner(System.in);
    public static void main(String[] args) {
        int c = 0;
        String in;

        for (int i = 0; i < 5; i++) {
            in = reader.next();
            if (in.length() % 2 == 0) {
                c++;
            }
        }
        System.out.println("Number of strings with even length: " + c);
    }
}
