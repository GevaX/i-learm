import java.util.Scanner;

public class Program {
    public static Scanner reader = new Scanner(System.in);
    // 3
    public static String betterComputersGradeStudentName(Student student1, Student student2) {
        if (student1.getCpu() > student2.getCpu()) {
            return student1.getName();
        }
        else if (student1.getCpu() < student2.getCpu()) {
            return student2.getName();
        }
        return null;
    }
    // 4
    public static double sharedAvgOfThreeStudents(Student student1, Student student2, Student student3) {
        double sumOfAvgs = student1.getAvg() + student2.getAvg() + student3.getAvg();
        double avg = sumOfAvgs / 3;
        return avg;
    }
    // 5
    public static void addMathBonus(Student s, int b) {
        if (s.getMat() + b <= 100) {
            s.setMat(s.getMat() + b);
        }
    }
    public static void main(String[] args) {
        String name;
        int mat, cpu, sport;
        // 1
        Student s1 = new Student("Matan", 95, 88, 90);
        Student s2 = new Student("Moshiko", 72, 100, 99);
        // 2
        System.out.println("Enter name:");
        name = reader.next();
        System.out.println("Enter grade in math:");
        mat = reader.nextInt();
        System.out.println("Enter grade in computers:");
        cpu = reader.nextInt();
        System.out.println("Enter grade in sport:");
        sport = reader.nextInt();
        Student s3 = new Student(name, mat, cpu, sport);
        // 3
        System.out.println(betterComputersGradeStudentName(s1, s2));
        System.out.println(betterComputersGradeStudentName(s3, s2));
        // 4
        sharedAvgOfThreeStudents(s1, s2, s3);
    }
}
