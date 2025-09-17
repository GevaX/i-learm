public class dP34E22 {
    public static int place(int[] arr, int target) {
        return placeHelper(arr, target, 0);
    }

    public static int placeHelper(int[] arr, int target, int index) {
        if (index >= arr.length) {
            return -1;
        }
        if (arr[index] == target) {
            return index;
        }
        return placeHelper(arr, target, index + 1);
    }
}
