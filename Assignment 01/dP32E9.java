public class dP32E9 {
    public static boolean isDigit(int n, int d) {
        if (n == 0) return false;
        if (n % 10 == d) return true;
        return isDigit(n / 10, d);
    }
}
