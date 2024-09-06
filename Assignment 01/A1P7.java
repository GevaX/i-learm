import java.util.Scanner;

public class A1P7 {
    public static Scanner reader = new Scanner(System.in);

    public static void main(String[] args) {
        int[] grades = new int[4];
        String[] subjects = {"Math", "English", "Science", "Sport"};

        System.out.println("Enter grades for each subject.");

        for (int i = 0; i < 4; i++) {
            System.out.print(subjects[i] + ": ");
            grades[i] = reader.nextInt();
        }

        double sum = 0;
        for (int grade : grades) {
            sum += grade;
        }
        double avg = sum / 4;

        System.out.println("Averge: " + avg);
    }
}
