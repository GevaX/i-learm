import java.util.Scanner;

public class P124E23 {
    public static Scanner reader = new Scanner(System.in);
    public static void main(String[] args) {
        int a, b, c, counter = 0;
        double avg;

        System.out.println("Enter 25 triples: ");
        for (int i = 0; i < 25; i++) {
            a = reader.nextInt();
            b = reader.nextInt();
            c = reader.nextInt();
            avg = (a + b + c) / 3.0;
            System.out.printf("Average of triple is %.3f%n", avg);
            if (avg > 0) {
                counter++;
            }
        }
        System.out.println("Number of triples with positive average is " + counter);
    }
}
