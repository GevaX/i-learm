import unit4.collectionsLib.BinNode;

public class e2016E2 {
    public static boolean upPath(BinNode<Integer> tr) {
        if (!tr.hasLeft() && !tr.hasRight())
            return true;

        boolean left = tr.hasLeft() && tr.getValue() < tr.getLeft().getValue();
        boolean right = tr.hasRight() && tr.getValue() < tr.getRight().getValue();
        return (left ? upPath(tr.getLeft()) : false) || (right ? upPath(tr.getRight()) : false);
    }
    // Time complexity: O(n), visit every node at worst case
}
