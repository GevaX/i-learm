public class dP32E1 {
    public static int sum(int n) {
        if (n == 1) {
            return n;
        }
        return n + sum(n - 1);
    }
}