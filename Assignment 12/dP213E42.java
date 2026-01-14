import unit4.collectionsLib.BinNode;
import unit4.collectionsLib.Queue;

public class dP213E42 {
    public static int levelDifference(BinNode<Integer> root, int x, int y) {
        int l1 = findLevel(root, x);
        int l2 = findLevel(root, y);

        return Math.abs(l1 - l2);
    }

    private static int findLevel(BinNode<Integer> tr, int v) {
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
