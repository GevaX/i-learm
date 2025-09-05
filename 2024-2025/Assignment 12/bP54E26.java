import java.util.Scanner;

public class bP54E26 {
    public static Scanner reader = new Scanner(System.in);
    public static void addBonusesToGrades(int[] grades) {
        for (int i = 0; i < grades.length; i++) {
            grades[i] += 10;
            if (grades[i] > 100) {
                grades[i] = 100;
            }
        }
    }
    public static int[] createArray(int length) {
        int[] grades = new int[length];

        for (int i = 0; i < grades.length; i++) {
            System.out.printf("Enter grade for student %d:%n", i + 1);
            grades[i] = reader.nextInt();
            while (grades[i] > 100 || grades[i] < 0) {
                System.out.println("Invalid input! try again");
                grades[i] = reader.nextInt();
            }
        }
        return grades;
    }
    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + ", ");
        }
    }
    public static void main(String[] args) {
        int numberOfStudents;

        System.out.println("Enter number of students:");
        numberOfStudents = reader.nextInt();
        int[] grades = createArray(numberOfStudents);
        addBonusesToGrades(grades);
        System.out.println("Updated grades:");
        printArray(grades);
    }
}
