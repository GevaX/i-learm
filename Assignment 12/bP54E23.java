public class bP54E23 {
    public static boolean isBalancedArray(int[] arr) {
        int sum = 0, aboveAverage = 0, belowAverage = 0;

        for (int num : arr) {
            sum += num;
        }
        double avg = (double) sum / arr.length;

        for (int num : arr) {
            if (num > avg) {
                aboveAverage++;
            } else if (num < avg) {
                belowAverage++;
            }
        }
        return aboveAverage == belowAverage;
    }
}
