import java.util.Scanner;

public class P71E11 {
    public static Scanner reader = new Scanner(System.in);
    public static void main(String[] args) {
        int drivingSpeed, allowedSpeed;
        System.out.println("Enter driving speed: ");
        drivingSpeed = reader.nextInt();
        System.out.println("Enter allowed speed: ");
        allowedSpeed = reader.nextInt();
        if (drivingSpeed < allowedSpeed) {
            System.out.println("Good job.");
        }
        else {
            System.out.println("Amout to pay: " + (30 * (drivingSpeed - allowedSpeed)));
        }
    }
}
