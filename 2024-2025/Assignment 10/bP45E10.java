public class bP45E10 {
    public static void main(String[] args) {
        int[] arr = new int[100];
        int sumEven = 0, sumOdd = 0;

        for (int i = 0; i < arr.length; i++) {
            if (i % 2 == 0) {
                sumEven += arr[i];
            }
            else {
                sumOdd += arr[i];
            }
        }

        if (sumEven == sumOdd) {
            System.out.println("The sum of values in even indices equals to the sum of values in odd places in the array.");
        }
        else {
            System.out.println("The sum of values in even indices not equals to the sum of values in odd places in the array.");
        }
    }
}
