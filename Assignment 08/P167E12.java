import java.util.Scanner;

public class P167E12 {
    public static Scanner reader = new Scanner(System.in);
    public static void main(String[] args) {
        int id, grade, studentC = 0, gradeC, sum, englishC = 0;
        double avg;

        System.out.println("Enter ID of student:");
        id = reader.nextInt();
        while (id != 0) {
            gradeC = 0;
            sum = 0;
            studentC++;
            System.out.println("Enter grades of student ID " + id);
            grade = reader.nextInt();
            while (grade != -999) {
                gradeC++;
                sum += grade;
                if (gradeC == 1 && grade >= 90) {
                    englishC++;
                }
                grade = reader.nextInt();
            }
            avg = (double) sum / gradeC;
            System.out.printf("Average of student ID #%d is %.2f%n", id, avg);
            
            System.out.println("Enter ID of student:");
            id = reader.nextInt();
        }
        System.out.println("Number of students in year A is " + studentC);
        System.out.println("Number of students with exemption from language studies is " + englishC);
    }
}