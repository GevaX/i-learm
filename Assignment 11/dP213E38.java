import unit4.collectionsLib.BinNode;
import unit4.collectionsLib.Queue;

public class dP213E38 {
    public static boolean isSorted(BinNode<Integer> tr) {
        if (tr == null) return true;

        Integer prev = null;
        Queue<BinNode<Integer>> q = new Queue<>();
        q.insert(tr);

        while (!q.isEmpty()) {
            BinNode<Integer> b = q.remove();
            if (prev != null && b.getValue() < prev) {
                return false;
            }
            prev = b.getValue();
            if (b.hasLeft()) {
                q.insert(b.getLeft());
            }
            if (b.hasRight()) {
                q.insert(b.getRight());
            }
        }
        return true;
    }
}
