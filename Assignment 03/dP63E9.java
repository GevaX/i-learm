public class dP63E9 {
    public static void intersection(int[] arr1, int[] arr2) {
        int i = 0, j = 0;
        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] == arr2[j]) {
                System.out.print(arr1[i] + " ");
                i++;
                j++;
            }
            else if (arr1[i] > arr2[j]) {
                j++;
            }
            else {
                i++;
            }
        }
    }
}
