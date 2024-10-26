import java.util.Scanner;

public class P146E12 {
    public static Scanner reader = new Scanner(System.in);
    public static void main(String[] args) {
        int workingHours, salaryPerHour, salary, sum = 0, avg;
        int i = 1;

        System.out.println("Enter working hours for worker 1 (or -999 to stop): ");
        workingHours = reader.nextInt();
        System.out.println("Enter salary per hour for worker 1 (or -999 to stop): ");
        salaryPerHour = reader.nextInt();
        while (workingHours != -999 && salaryPerHour != -999) {
            salary = workingHours * salaryPerHour;
            if (workingHours > 150) {
                salary += 250;
            }
            sum += salary;
            i++;
            System.out.printf("Enter working hours for worker %d (or -999 to stop): ", i + 1);
            workingHours = reader.nextInt();
            System.out.printf("Enter salary per hour for worker %d (or -999 to stop): ", i + 1);
            salaryPerHour = reader.nextInt();
        }

        if (i > 0) {
            avg = sum / i;
            System.out.println("Sum of money spent on salaries is " + sum);
            System.out.println("The average salary is " + avg);
        } else {
            System.out.println("No valid input provided.");
        }
}
}
