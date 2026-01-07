import unit4.collectionsLib.BinNode;
import unit4.collectionsLib.Queue;

public class dP213E40 {
    public static void printEvenLevels(BinNode<Integer> tr) {
        if (tr == null) return;

        Queue<BinNode<Integer>> q = new Queue<>();
        Queue<Integer> depth = new Queue<>();
        q.insert(tr);
        depth.insert(0);

        while (!q.isEmpty()) {
            BinNode<Integer> b = q.remove();
            int currentDepth = depth.remove();
            if (currentDepth % 2 == 0) {
                System.out.println(b.getValue());
            }
            if (b.hasRight()) {
                q.insert(b.getRight());
                depth.insert(currentDepth + 1);
            }
            if (b.hasLeft()) {
                q.insert(b.getLeft());
                depth.insert(currentDepth + 1);
            }
        }
    }
}
