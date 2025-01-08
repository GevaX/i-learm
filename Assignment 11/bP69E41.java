import java.util.Scanner;

public class bP69E41 {
    public static Scanner reader = new Scanner(System.in);
    public static void main(String[] args) {
        int N;

        System.out.println("Enter the number of integers (N):");
        N = reader.nextInt();
        int[] originalArray = new int[N];
        int evenCount = 0;
        int negativeCount = 0;
        for (int num : originalArray) {
            if (num % 2 == 0) {
                evenCount++;
            }
            if (num < 0) {
                negativeCount++;
            }
        }

        int[] evenArray = new int[evenCount];
        int[] negativeArray = new int[negativeCount];
        int evenIndex = 0;
        int negativeIndex = 0;
        for (int num : originalArray) {
            if (num % 2 == 0) {
                evenArray[evenIndex++] = num;
            }
            if (num < 0) {
                negativeArray[negativeIndex++] = num;
            }
        }

        System.out.println("Even numbers array:");
        for (int num : evenArray) {
            System.out.print(num + " ");
        }
        System.out.println();
        System.out.println("Negative numbers array:");
        for (int num : negativeArray) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
