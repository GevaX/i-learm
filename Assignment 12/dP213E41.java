import unit4.collectionsLib.BinNode;
import unit4.collectionsLib.Queue;

public class dP213E41 {
    public static int findLevel(BinNode<Integer> tr, int v) {
        Queue<BinNode<Integer>> q = new Queue<>();
        Queue<Integer> depth = new Queue<>();
        q.insert(tr);
        depth.insert(0);

        while (!q.isEmpty()) {
            BinNode<Integer> b = q.remove();
            int currentDepth = depth.remove();
            if (b.getValue() == v) {
                return currentDepth;
            }
            if (b.hasLeft()) {
                q.insert(b.getLeft());
                depth.insert(currentDepth + 1);
            }
            if (b.hasRight()) {
                q.insert(b.getRight());
                depth.insert(currentDepth + 1);
            }
        }
        return -1; // Not found
    }
}
