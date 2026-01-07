import unit4.collectionsLib.BinNode;

public class dP205E22 {
    public static boolean isChildBalanced(BinNode<Integer> tr) {
        if (tr == null) return true;

        if ((tr.hasLeft() && tr.hasRight()) || !(tr.hasLeft() || tr.hasRight())) {
            return isChildBalanced(tr.getLeft()) && isChildBalanced(tr.getRight());
        }
        else {
            return false;
        }
    }
}
