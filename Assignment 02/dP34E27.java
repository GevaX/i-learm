public class dP34E27 {
    public static int numberOfShows(int[][] arr, int n) {
        return numberOfShowsHelper(arr, n, 0, 0);
    }

    public static int numberOfShowsHelper(int[][] arr, int n, int i, int j) {
        if (i >= arr.length) {
            return 0;
        }
        if (j >= arr[i].length) {
            return numberOfShowsHelper(arr, n, i + 1, 0);
        }
        int c = (arr[i][j] == n) ? 1 : 0;
        return c + numberOfShowsHelper(arr, n, i, j++);
    }
}
