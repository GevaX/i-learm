import java.util.Scanner;

public class P132E37 {
    public static Scanner reader = new Scanner(System.in);
    public static void main(String[] args) {
        int rPoints, tPoints, rSum = 0, tSum = 0, rCounter = 0, tCounter = 0, tieCounter = 0;

        for (int i = 1; i <= 10; i++) {
            System.out.println("Enter points for roy and tal for game " + i);
            rPoints = reader.nextInt();
            tPoints = reader.nextInt();
            rSum += rPoints;
            tSum += tPoints;
            if (rPoints > tPoints) {
                System.out.println("Roy won in game " + i);
                rCounter++;
            }
            else if (rPoints < tPoints) {
                System.out.println("Tal won in game " + i);
                tCounter++;
            }
            else {
                System.out.println("Tie in game " + i);
                tieCounter++;
            }
        }
        if (rSum > tSum) {
            System.out.println("Roy scored more in total");
        }
        else if (rSum < tSum) {
            System.out.println("Tal scored more in total");
        }
        else {
            System.out.println("Both players scored the same in total");
        }
        System.out.printf("Roy won %d games%n", rCounter);
        System.out.printf("Tal won %d games%n", tCounter);
        System.out.printf("%d games ended in a tie", tieCounter);
    }
}
