import java.util.Scanner;

public class P138E53 {
    public static Scanner reader = new Scanner(System.in);
    public static void main(String[] args) {
        int duration, sum = 0, c = 0;

        for (int i = 0; i < 40; i++) {
            System.out.println("Enter duration to reach finish line (s) for car " + (i + 1));
            duration = reader.nextInt();
            if (duration > 300) {
                System.out.println("You doesn't advance to the final level");
            }
            else if (duration <= 240) {
                c++;
            } 
            sum += duration;
        }
        System.out.println("Number of cars bellow 4 minutes to finish race is " + c);
        System.out.println("Average of all times is " + (sum / 40));
    }
}
