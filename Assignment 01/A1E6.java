import java.util.Scanner;

public class A1E6 {
    public static Scanner reader = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Enter number of day working hours for month: ");
        int dayWorkingHours = reader.nextInt();
        System.out.println("Enter number of night working hours for month: ");
        int nightWorkingHours = reader.nextInt();

        double salary = (dayWorkingHours * 18) + (nightWorkingHours * 27.5);
        System.out.println("Sallery = " + salary + " NIS");
    }
}
