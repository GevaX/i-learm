import java.util.Scanner;

public class P193E19 {
    public static Scanner reader = new Scanner(System.in);
    public static int weightedGrade(int grade, int units) {
        int weightedGrade;

        if (units == 5) {
            weightedGrade = (int) (grade / 100.0 * 20);    
        }
        else if (units == 4) {
            weightedGrade = (int) (grade / 100.0 * 10);    
        }
        else {
            System.out.println("Invalid input");
            return 0;
        }
        return weightedGrade;
    }
    public static void main(String[] args) {
        int grade, units, fGrade = 0, i = 1;

        System.out.println("Enter grade and number of units for each subject (end with -1 units):");
        System.out.println("Subject 1:");
        grade = reader.nextInt();
        units = reader.nextInt();
        while (units != -1) {
            i++;
            fGrade += weightedGrade(grade, units);
            System.out.printf("Subject %d:%n", i);
            grade = reader.nextInt();
            units = reader.nextInt();
        }
        System.out.println("Final grade is " + fGrade);
    }
}
