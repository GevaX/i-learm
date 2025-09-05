import java.util.Scanner;

public class P165E2 {
    public static Scanner reader = new Scanner(System.in);
    public static void main(String[] args) {
        int grade, sum, fails = 0;
        double avg;

        for (int i = 1; i <= 10; i++) {
            sum = 0;
            System.out.printf("Enter grades for student %d:%n", i);
            for (int j = 0; j < 6; j++) {
                grade = reader.nextInt();
                if (grade < 50) {
                    fails++;
                }
                sum += grade;
            }
            avg = (double) sum / 6;
            System.out.printf("Average for student %d is %.2f%n", i, avg);
        }
        System.out.println("Number of failing grades for all students is " + fails);
    }
}
