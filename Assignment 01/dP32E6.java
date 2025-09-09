public class dP32E6 {
    public static int mostSignificantDigit(int n) {
        if (n < 10) {
            return n;
        }
        return mostSignificantDigit(n / 10);
    }
}
