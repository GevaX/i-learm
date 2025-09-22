public class dP36E42 {
    public static void printEvenIndices(int[] arr) {
        printEvenIndicesHelper(arr, 0);
    }

    private static void printEvenIndicesHelper(int[] arr, int i) {
        if (i >= arr.length) {
            return;
        }

        System.out.println(arr[i]);
        printEvenIndicesHelper(arr, i + 2);
    }
}
