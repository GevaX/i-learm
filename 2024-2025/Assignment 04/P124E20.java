import java.util.Scanner;

public class P124E20 {
    public static Scanner reader = new Scanner(System.in);
    public static void main(String[] args) {
        int temp, c = 0;

        System.out.println("Enter temperature for each day in a week: ");
        for (int i = 0; i < 7; i++) {
            temp = reader.nextInt();
            if (temp > 16) {
                c++;
            }
        }
        System.out.println("Number of days temperature exceeded 16 is " + c);
    }
}
