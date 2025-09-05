import java.util.Scanner;

public class P137E48 {
    public static Scanner reader = new Scanner(System.in);
    public static void main(String[] args) {
        int in, hundreds, tens, ones, c = 0;

        for (int i = 0; i < 50; i++) {
            in = reader.nextInt();
            if (in < 100 || in > 999) {
                System.out.println("Invalid input");
                i--;
                continue;
            }
            hundreds = in / 100;
            tens = (in / 10) % 10;
            ones = in % 10;
            if ((hundreds == tens) || (hundreds == ones) || (tens == ones)) {
                System.out.println("At least two digits are same");
                c++;
            }
        }
        System.out.println("Counter: " + c);
    }
}
