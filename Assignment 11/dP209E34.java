import unit4.collectionsLib.BinNode;

public class dP209E34 {
    public static void fixChildValues(BinNode<Integer> parent) {
        if (parent == null) return;

        if (parent.hasLeft()) {
            BinNode<Integer> left = parent.getLeft();
            if (left.getValue().equals(parent.getValue())) {
                left.setValue(nextAvailable(left, parent.getValue() + 1));
            }
            fixChildValues(left);
        }

        if (parent.hasRight()) {
            BinNode<Integer> right = parent.getRight();
            if (right.getValue().equals(parent.getValue())) {
                right.setValue(nextAvailable(right, parent.getValue() + 1));
            }
            fixChildValues(right);
        }
    }

    private static int nextAvailable(BinNode<Integer> subtree, int start) {
        int candidate = start;
        while (existsInTree(subtree, candidate)) {
            candidate++;
        }
        return candidate;
    }

    private static boolean existsInTree(BinNode<Integer> tr, int value) {
        if (tr == null) return false;
        if (tr.getValue() == value) return true;
        return existsInTree(tr.getLeft(), value) || existsInTree(tr.getRight(), value);
    }
}
