public class dP34E21 {
    public static boolean isAscendingOrder(int[] arr) {
        return isAscendingOrderHelper(arr, 0);
    }

    public static boolean isAscendingOrderHelper(int[] arr, int i) {
        if (i == arr.length - 1) {
            return true;
        }
        if (arr[i] > arr[i + 1]) {
            return false;
        }
        return isAscendingOrderHelper(arr, i = 1);
    }
}
