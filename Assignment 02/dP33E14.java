public class dP33E14 {
    public static int foo(int n) {
        if (n == 1) {
            return 2;
        }
        if (n % 2 == 0) {
            return n * n + foo(n - 1);
        }
        return n * 2 + foo(n - 1);
    }
}
