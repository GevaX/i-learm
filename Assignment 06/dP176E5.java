import unit4.collectionsLib.Queue;;

public class dP176E5 {
    public static boolean isSelfRepeating(Queue<Integer> queue, int n) {
        Queue<Integer> temp = new Queue<>();

        for (int i = 1; i <= n; i++) {
            int c = 0;

            while (!queue.isEmpty()) {
                int e = queue.remove();
                if (e == i) {
                    c++;
                }
                temp.insert(e);
            }

            while (!temp.isEmpty()) {
                queue.insert(temp.remove());
            }
            if (c != i) return false;
        }
        return true;
    }
}
