import java.util.Scanner;

public class Program4 {
    public static Scanner reader = new Scanner(System.in);

    public static void doctorRating(Doctor[] doctors) {
        int input;

        for (int i = 0; i < doctors.length; i++) {
            int sum = 0;
            int c = 0;
            System.out.println("Enter ratings for Doctor. " + doctors[i].getName());
            input = reader.nextInt();;
            while (input != -1) {
                sum += input;
                c++;
                input = reader.nextInt();
            }
            doctors[i].setRate(sum / (double) c);
        }
    }
}
