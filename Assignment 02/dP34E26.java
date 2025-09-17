public class dP34E26 {
    public static boolean areArraysSame(int[] arr1, int[] arr2) {
        if (arr1.length != arr2.length) {
            return false;
        }

        return areArraysSameHelper(arr1, arr2, 0);
    }

    public static boolean areArraysSameHelper(int[] arr1, int[] arr2, int i) {
        if (i == arr1.length) {
            return arr1[i] == arr2[i];
        }
        if (arr1[i] != arr2[i]) {
            return false;
        }
        return areArraysSameHelper(arr1, arr2, i + 1);
    }
}
