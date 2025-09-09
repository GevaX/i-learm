public class dP32E10 {
    public static boolean isProduct(int x, int y) {
        if (x == 0) return true;
        if (x < 0) return false;
        return isProduct(x-y, y);
    }
}
