import java.util.Scanner;

public class bP54E28 {
    public static Scanner reader = new Scanner(System.in);

    public static void longestSequence(int[] arr) {
        int temp = arr[0];
        int currentLength = 1, maxLength = 1;

        for (int i = 1; i < arr.length; i++) {
            if (temp == arr[i]) {
                currentLength++;
                maxLength = Math.max(maxLength, currentLength);
            } 
            else {
                currentLength = 1;
            }
            temp = arr[i];
        }
        System.out.println("Length of longest sequence with the same numbers in the array is " + maxLength);
    }
}
