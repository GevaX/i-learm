public class dP32E4 {
    public static int numOfDigits(int n) {
        if (n < 10) {
            return 1;
        }
        return 1 + numOfDigits(n / 10);
    }
}
