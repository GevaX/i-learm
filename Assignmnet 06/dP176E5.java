import unit4.collectionsLib.Queue;;

public class dP176E5 {
    // Using sums
    public static boolean isSelfRepeating(Queue<Integer> queue, int n) {
        int sumA = 0;
        int sumB = 0;

        for (int i = 1; i <= n; i++) {
            sumA += i*i;
        }
        while (!queue.isEmpty()) {
            sumB += queue.remove();
        }
        return sumA == sumB;
    }

    // Using products
    public static boolean isSelfRepeatingB(Queue<Integer> queue, int n) {
        int prodA = 1;
        int prodB = 1;

        for (int i = 1; i <= n; i++) {
            prodA *= Math.pow(i, i);
        }
        while (!queue.isEmpty()) {
            int e = queue.remove();
            prodB *= Math.pow(e, e);
        }
        return prodA == prodB;
    }
}
