import java.util.Scanner;

public class A2P8 {
    public static Scanner reader = new Scanner(System.in);
    public static void main(String[] args) {
        double workingHours, absences, salary, salaryPerHour;
        System.out.println("Enter working hours: ");
        workingHours = reader.nextDouble();
        System.out.println("Enter absences: ");
        absences = reader.nextDouble();
        System.out.println("Enter salary per hour: ");
        salaryPerHour = reader.nextDouble();

        salary = workingHours * salaryPerHour;
        if (absences < 3.5) {
            salary += salary * 0.1;
        }
        System.out.println("Salary is " + salary);
    }
}
