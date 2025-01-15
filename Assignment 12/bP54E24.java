import java.util.Random;

public class bP54E24 {
    public static void lessThanSuccessorPointers(int[] ar) {
        for (int i = 0; i < ar.length - 1; i++) {
            if (ar[i] < ar[i + 1]) {
                System.out.print(ar[i] + ", ");
            }
        }
    }
    public static void main(String[] args) {
        int[] array = new int[20];
        Random random = new Random();

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(10);
        }
        lessThanSuccessorPointers(array);
        // Maximum number of outputs: 19
        // That is because the method is iterating over 19 elements, thats is cause the condition is checked for array.length - 1.
        // In the worst case that the array is strictly ascending (0,1,2, ..., 9 repeated) all 19 compressions will satisfy the condition making the maximum number of outputs 19.
    }
}
