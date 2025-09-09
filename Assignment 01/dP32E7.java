public class dP32E7 {
    public static int quotient(int a, int b) {
        if (a < b) {
            return 0;
        }
        return 1 + quotient(a-b, b);
    }
}
