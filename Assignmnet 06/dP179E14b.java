import unit4.collectionsLib.Queue;

public class dP179E14b {
    public static void minPriority(Queue<Queue<Integer>> q) {
        while (!q.isEmpty()) {
            Queue<Queue<Integer>> temp = new Queue<>();
            Queue<Integer> minQueue = null;
            int minValue = Integer.MAX_VALUE;

            while (!q.isEmpty()) {
                Queue<Integer> current = q.remove();
                if (!current.isEmpty()) {
                    int first = current.head();
                    if (first < minValue) {
                        minValue = first;
                        minQueue = current;
                    }
                    temp.insert(current);
                }
            }

            while (!temp.isEmpty()) {
                q.insert(temp.remove());
            }

            if (minQueue != null) {
                minQueue.remove();
                System.out.print(minValue + " ");
            }
        }
    }
}