import java.util.Scanner;

public class P158E36 {
    public static Scanner reader = new Scanner(System.in);

    public static void main(String[] args) {
        int in, prev, c = 1, mc = 0;

        System.out.println("Enter positive integers: ");
        in = reader.nextInt();
        prev = in;
        while (in != 0) {
            if (in > prev) {
                c++;
            }
            else {
                if (c > mc) {
                    mc = c;
                }
                c = 1;
            }
            prev = in;
            in = reader.nextInt();
        }
        mc = Math.max(c, mc);
        System.out.println("Length of the largest ascending sequence is " + mc);
    }
}
