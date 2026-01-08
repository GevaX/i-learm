import unit4.collectionsLib.BinNode;
import unit4.collectionsLib.Queue;

public class dP213E39 {
    public static void printLevel(BinNode<Integer> tr, int level) {
        if (tr == null) return;

        Queue<BinNode<Integer>> q = new Queue<>();
        Queue<Integer> depth = new Queue<>();
        q.insert(tr);
        depth.insert(0);

        while (!q.isEmpty()) {
            BinNode<Integer> b = q.remove();
            int currentDepth = depth.remove();
            if (currentDepth == level) {
                System.out.println(b.getValue());
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
    }
}
