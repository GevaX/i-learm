import java.util.Scanner;

public class bP62E35 {
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
        int[] numberOfTickets = new int[15];
        int showSelected;

        System.out.println("Enter number of show (1-15):");
        showSelected = reader.nextInt();
        while (showSelected != 0) {
            System.out.println("Enter number of tickets:");
            numberOfTickets[showSelected - 1] = reader.nextInt();
            System.out.println("Enter number of show (1-15):");
            showSelected = reader.nextInt();
        }
        System.out.println("Number of tickets needed for each show:");
        for (int i = 0; i < numberOfTickets.length; i++) {  
            System.out.printf("Show %d: %d %n", i + 1, numberOfTickets[i]);
        }
        System.out.println("Show with most tickets sold is " + (maxArrayPointer(numberOfTickets) + 1));
    }
}
