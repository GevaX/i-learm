import java.util.Scanner;

public class bP62E36 {
    public static Scanner reader = new Scanner(System.in);
    public static int maxArrayPointer(int[] arr) {
        int maxP = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > arr[maxP]) {
                maxP = i;
            }
        }
        return maxP;
    }
    public static void main(String[] args) {
        int workerID, vote, sum = 0, avg;
        System.out.println("Enter number of candidates:");
        int[] votes = new int[reader.nextInt()];

        System.out.println("Enter worker ID:");
        workerID = reader.nextInt();
        while (workerID != -999) {
            System.out.println("Enter 1 if you support and 0 if you don't support for each candidate");
            for (int i = 0; i < votes.length; i++) {
                System.out.print((i + 1) + ": ");
                vote = reader.nextInt();
                votes[i] += vote;
                sum += vote;
            }
            System.out.println("Enter worker ID:");
            workerID = reader.nextInt();
        }
        System.out.println("Candidate received most votes is " + (maxArrayPointer(votes) + 1));
        System.out.println("Candidates that received less votes then average:");
        avg = sum / votes.length;
        for (int i = 0; i < votes.length; i++) {
            if (votes[i] < avg) {
                System.out.print((i + 1) + ", ");
            }
        }
    }
}
