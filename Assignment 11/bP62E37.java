import java.util.Scanner;

public class bP62E37 {
    public static Scanner reader = new Scanner(System.in);
    public static void main(String[] args) {
        int[] grades = new int[200];
        int[] count = new int[101];
        int[] ranges = new int[10];
        int grade;

        System.out.println("Enter grades:");
        for (int i = 0; i < grades.length; i++) {
            grade = reader.nextInt();
            while (grade > 100 || grade < 0) {
                System.out.println("Invalid input, try again.");
                grade = reader.nextInt();
            }
            grades[i] = grade;
        }
        for (int i = 0; i < grades.length; i++) {
            count[grades[i]]++;
            ranges[grades[i] / 10]++;
        }
        System.out.println("Grade Distribution:");
        for (int i = 100; i >= 0; i--) {
            System.out.println(i + ": " + count[i]);
        }
        
        int maxRangeIndex = 0;
        for (int i = 1; i < ranges.length; i++) {
            if (ranges[i] > ranges[maxRangeIndex]) {
                maxRangeIndex = i;
            }
        }
        int rangeStart = maxRangeIndex * 10;
        int rangeEnd = rangeStart + 9;
        System.out.println("\nMost Common Range: " + rangeStart + "-" + rangeEnd);
        System.out.println("Count: " + ranges[maxRangeIndex]);
    }
}

