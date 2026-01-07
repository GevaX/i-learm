import unit4.collectionsLib.BinNode;
import unit4.collectionsLib.Queue;

public class dP205E20 {
    public static int sumDifference(BinNode<Integer> tr) {
        if (tr == null) return 0;

        int positiveS = 0, negativeS = 0;
        Queue<BinNode<Integer>> q = new Queue<>();
        q.insert(tr);

        while (!q.isEmpty()) {
            BinNode<Integer> b = q.remove();

            if (b.getValue() >= 0) {
                positiveS += b.getValue();
            }
            else {
                negativeS += b.getValue();
            }

            if (b.hasLeft()) {
                q.insert(b.getLeft());
            }
            if (b.hasRight()) {
                q.insert(b.getRight());
            }
        }
        
        if (positiveS > -negativeS) {
            return positiveS + negativeS; // positive minus absolute of negative
        } else {
            return negativeS - positiveS; // negative minus positive
        }
    }
}
