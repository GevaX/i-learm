public class dP32E8 {
    public static int remainder(int a, int b) {
        if (a < b) {
            return a;
        }
        return remainder(a-b, b);
    }
}
