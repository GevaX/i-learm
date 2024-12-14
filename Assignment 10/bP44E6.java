public class bP44E6 {
    public static void main(String[] args) {
        int[] a = new int[10];
        
        // a
        a[0] = 10;
        for (int i = 1; i < a.length; i++) {
            a[i] = a[i - 1] + 10;
        }
        // b
        for (int i = 0; i < a.length; i++) {
            a[i] = (int) Math.pow(i + 1, 2);
        }
        // c
        a[0] = 1;
        for (int i = 1; i < a.length; i++) {
            if (i % 2 == 0) {
                a[i] = a[i - 2] + 2;
            } else {
                a[i] = 0;
            }
        }
        // d
        a[0] = 3;
        for (int i = 1; i < a.length; i++) {
            a[i] = a[i - 1] + 3;
        }
        // e
        a[0] = 2;
        a[1] = -4;
        for (int i = 2; i < a.length; i++) {
            if (i % 2 == 0) {
                a[i] = a[i - 2] + 4;
            } else {
                a[i] = a[i - 2] - 4;
            }
        }
        // f
        a[0] = 7;
        for (int i = 1; i < a.length; i++) {
            a[i] = a[i - 1] + i;
        }
    }
}