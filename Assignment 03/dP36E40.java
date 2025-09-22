public class dP36E40 {
    public static void printSeries(int a1, int d, int n) {
        if (n == 0) {
            return;
        }
        System.out.print(a1 + " ");
        printSeries(a1 + d, d, n - 1);
    }
}
