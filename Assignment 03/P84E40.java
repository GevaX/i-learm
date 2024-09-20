import java.util.Scanner;

public class P84E40 {
    public static Scanner reader = new Scanner(System.in);
    public static void main(String[] args) {
        int petGrade;
        double bagrutAvg;
        System.out.println("Enter grade for the PET: ");
        petGrade = reader.nextInt();
        System.out.println("Enter averge of Bagrut exams: ");
        bagrutAvg = reader.nextDouble();

        if (petGrade >= 600 && bagrutAvg >= 90) {
            System.out.println("Accepted");
        }
        else if (petGrade < 600) {
            System.out.println("You need to take the tests again");
        }
        else if (bagrutAvg < 90) {
            System.out.println("You need to improve your bagrut");
        }
        else {
            System.out.println("Not accepted");
        }
    }
}