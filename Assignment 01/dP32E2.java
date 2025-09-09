public class dP32E2 {
    public static int productOfOdds(int n) {
        if (n % 2 == 0) {
            return productOfOdds(n - 1);
        }
        if (n == 1) {
            return 1;
        }
        return n * productOfOdds(n - 2);
    }
}
