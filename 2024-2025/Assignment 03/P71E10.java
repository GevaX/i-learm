import java.util.Scanner;

public class P71E10 {
    public static Scanner reader = new Scanner(System.in);
    public static void main(String[] args) {
        int class1, class2, class3, total, buses;
        System.out.println("Enter number of students in class 1: ");
        class1 = reader.nextInt();
        System.out.println("Enter number of students in class 2: ");
        class2 = reader.nextInt();
        System.out.println("Enter number of students in class 3: ");
        class3 = reader.nextInt();
        
        total = class1 + class2 + class3;
        buses = total / 40;

        if (total % 40 != 0) {
            buses ++;
        }
        System.out.println("Number of busses needed: " + buses);
    }
}