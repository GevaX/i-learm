public class bP46E15 {
    static final int TOP = 10;
    public static void main(String[] args) {
        int[] a = new int[TOP];
        int[] b = new int[TOP];
        int[] c = new int[TOP];

        for (int i = 0; i < c.length; i++) {
            c[i] = Math.max(a[i], b[i]);
            if (a[i] == b[i]) {
                c[i] = 0;
            }
        }
    }
}
