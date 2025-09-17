public class dP34E20 {
    public static int positiveNumbers(int[] arr, int i) {
        if (i == 0) {
            return arr[i] > 0 ? 1 : 0;
        }
        return (arr[i] > 0 ? 1 : 0) + positiveNumbers(arr, i - 1);
    }
}
