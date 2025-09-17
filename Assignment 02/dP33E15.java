public class dP33E15 {
    public static double foo(int n) {
        if (n == 1) {
            return 1;
        }
        if (((n - 1) / 2) % 2 == 0) {
            return n + foo(n - 2);
        } else {
            return -(Math.sqrt(n)) + foo(n - 2);
        }
    }

    public static void main(String[] args) {
        System.out.println(foo(7));
    }
}
