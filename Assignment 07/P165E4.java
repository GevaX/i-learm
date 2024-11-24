import java.util.Scanner;

public class P165E4 {
    public static Scanner reader = new Scanner(System.in);
    public static void main(String[] args) {
        int wage, workingHours = 0, salary, sum = 0, avg;

        for (int i = 1; i <= 500; i++) {
            System.out.printf("Enter wage per hour for worker %d:%n", i);
            wage = reader.nextInt();
            System.out.println("Enter working hours for each day for 25 days in the month: ");
            for (int j = 0; j < 25; j++) {
                workingHours += reader.nextInt();
            }
            salary = workingHours * wage;
            sum += salary;
            System.out.printf("Salary for worker %d is %d%n", i, salary);
        }
        avg = sum / 500;
        System.out.println("Average salary in factory is " + avg);
    }
}
