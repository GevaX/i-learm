public class dP34E28 {
    public static boolean areElementsLarger(int[][] mat, int num) {
        return areElementsLargerHelper(mat, num, 0, 0);
    }

    public static boolean areElementsLargerHelper(int[][] arr, int n, int i, int j) {
        if (i == arr.length) {
            return true;
        }
        if (j >= arr[i].length) {
            return areElementsLargerHelper(arr, n, i + 1, 0);
        }
        if (arr[i][j] <= n) {
            return false;
        }
        return areElementsLargerHelper(arr, n, i, j++);
    }
}
