public class bP54E30 {
    public static boolean isHalfSortedArray(int[] arr) {
        int c = 1, maxC = 1;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] >= arr[i-1]) {
                c++;
            }
            else {
                maxC = Math.max(c, maxC);
                c = 1;
            }
        }
        return Math.max(maxC, c) > arr.length / 2;  
    }
}
