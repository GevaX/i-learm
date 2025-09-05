import java.util.Scanner;

public class ProgramS {
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
        s.setMat(Math.min(100, s.getMat() + b));
    }
    // b1
    public static Student[] buildArray(int n) {
        Student[] sts = new Student[n];
        String name;
        int mat, cpu, sport;

        for (int i = 0; i < sts.length; i++) {
            System.out.println("Enter name:");
            name = reader.next();
            System.out.println("Enter grade in math:");
            mat = reader.nextInt();
            System.out.println("Enter grade in computers:");
            cpu = reader.nextInt();
            System.out.println("Enter grade in sport:");
            sport = reader.nextInt();
            sts[i] = new Student(name, mat, cpu, sport);
        }
        return sts;
    }
    // b2
    public static void failingStudents(Student[] sts) {
        for (Student st : sts) {
            if (st.getAvg() < 55) {
                System.out.println(st.getName());
            }
        }
    }
    // b3
    public static String highestAvgStudentName(Student[] sts) {
        double max = 0;
        int si = -1;

        for (int i = 0; i < sts.length; i++) {
            if (sts[i].getAvg() > max) {
                max = sts[i].getAvg();
                si = i;
            }
        }
        return sts[si].getName();
    }
    // b4
    public static Student lowestSportGrade(Student[] sts) {
        int min = 100;
        int si = -1;

        for (int i = 0; i < sts.length; i++) {
            if (sts[i].getSport() < min) {
                min = sts[i].getSport();
                si = i;
            }
        }
        return sts[si];
    }
    // b5
    public static void addBonusToArray(Student[] sts) {
        for (int i = 0; i < sts.length; i++) {
            addMathBonus(sts[i], 5);
        }
    }
    // b6
    public static boolean isStudentInClass(Student[] students, String name) {
        for (int i = 0; i < students.length; i++) {
            if (students[i].getName().equals(name)) {
                return true;
            }
        }
        return false;
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
