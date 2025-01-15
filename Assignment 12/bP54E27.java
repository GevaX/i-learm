public class bP54E27 {
    public static int mostSignificantDigit(int n) {
        while (n >= 10) {
            n /= 10;
        }
        return n;
    }
    public static boolean isUniqueArray(int[] a) {
        for (int i = 1; i < a.length; i++) {
            if (mostSignificantDigit(a[i]) != a[i-1] % 10) {
                return false;
            }
        }
        return true;
    }
}
