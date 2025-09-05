import java.util.Random;
import java.util.Scanner;

public class bP54E25 {
    public static Scanner reader = new Scanner(System.in);
    public static void printElementsAtOddOrEvenIndices(int[] arr, int n) {
        if (n % 2 == 0) {
            System.out.println("Elements in even indices:");
            for (int i = 0; i < arr.length; i += 2) {
                System.out.println(arr[i]);
            }
        }
        else {
            System.out.println("Elements in odd indices:");
            for (int i = 1; i < arr.length; i += 2) {
                System.out.println(arr[i]);
            }
        }
    }
    public static void main(String[] args) {
        int[] arr = new int[30];
        Random random = new Random();
        
        System.out.println("Enter 30 integers:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = reader.nextInt();
        }
        int n = random.nextInt(10);
        printElementsAtOddOrEvenIndices(arr, n);
        printElementsAtOddOrEvenIndices(arr, n + 1);
    }
}
