import java.util.Scanner;

public class P136E42 {
    public static Scanner reader = new Scanner(System.in);
    public static void main(String[] args) {
        int in , max = 0, sID = 0;

        for (int i = 1; i <= 8; i++) {
            System.out.printf("Enter jumping result for student %d: ", i);
            in = reader.nextInt();
            while (in <= 0) {
                System.out.printf("Invalid input.%nEnter jumping result for student %d: ", i);
                in = reader.nextInt();
            }
            if (max < in) {
                max = in;
                sID = i;
            }
        }
        System.out.printf("Highest jumping result is %d by student %d", max, sID);
    }
}
