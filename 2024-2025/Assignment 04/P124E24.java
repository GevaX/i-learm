import java.util.Scanner;

public class P124E24 {
    public static Scanner reader = new Scanner(System.in);
    public static void main(String[] args) {
        int grade1, grade2, c1 = 0, c2 = 0, c3 = 0;

        for (int i = 0; i < 20; i++) {
            System.out.println("Enter 2 grades for student (If didn't submit enter -1) " + (i + 1));
            grade1 = reader.nextInt();
            grade2 = reader.nextInt();
            if (grade1 != -1 && grade2 != -1) {
                c1++;
            }
            else if (grade1 == -1 && grade2 == -1) {
                c2++;
            }
            else {
                c3++;
            }
        }
        System.out.println("Number of students that submitted both projects is " + c1);
        System.out.println("Number of students that submitted only one project is " + c3);
        System.out.println("Number of students that didn't submit both projects is " + c2);
    }
}
