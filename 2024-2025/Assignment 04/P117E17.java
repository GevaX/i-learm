import java.util.Scanner;

public class P117E17 {
    public static Scanner reader = new Scanner(System.in);
    public static void main(String[] args) {
        double mathGrade, physicsGrade, csGrade, avg;

        for (int i = 1; i <= 58; i++) {
            System.out.printf("Enter grades for student %d: %n", i);

            System.out.print("Math: ");
            mathGrade = reader.nextDouble();
            System.out.print("Physics: ");
            physicsGrade = reader.nextDouble();
            System.out.print("Computer Science: ");
            csGrade = reader.nextDouble();

            avg = (mathGrade + physicsGrade + csGrade) / 3;

            if (avg > 92 && (mathGrade >= 90 && physicsGrade >= 90 && csGrade >= 90)) {
                System.out.printf("Student %d advances to stage B with an average of %.2f%n", i, avg);
            }
        }
    }
}
