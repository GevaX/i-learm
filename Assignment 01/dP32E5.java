public class dP32E5 {
    public static int evenDigitsSum(int n) {
        if (n < 10) {
            return n % 2 == 0 ? n : 0;
        }
        return (n % 10 % 2 == 0 ? n % 10 : 0) + evenDigitsSum(n/10);
    }
}
