public class Q2 {
    public int dotProduct(int[] arr1, int[] arr2) {
        int maxLength = Math.max(arr1.length, arr2.length);
        int sum = 0;

        for (int i = 0; i < maxLength; i++) {
            int val1 = (i < arr1.length) ? arr1[i] : 0;
            int val2 = (i < arr2.length) ? arr2[i] : 0;
            sum += val1 * val2;
        }

        return sum;
    }

    private boolean hasNonZero(int[] arr) {
        for (int val : arr) {
            if (val != 0) return true;
        }
        return false;
    }

    public boolean isParallelArrays(int[] arr1, int[] arr2) {
        return dotProduct(arr1, arr2) == 0 && hasNonZero(arr1) && hasNonZero(arr2);
    }
}
