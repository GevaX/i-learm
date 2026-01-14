import unit4.collectionsLib.BinNode;

public class dP219E47 {
    public static boolean isSearchTree(BinNode<Integer> root) {
        return isSearchTree(root, null, null);
    }

    private static boolean isSearchTree(BinNode<Integer> tr, Integer min, Integer max) {
        if (tr == null) return true;

        if ((min != null && tr.getValue() <= min) || (max != null && tr.getValue() >= max)) {
            return false;
        }
        return isSearchTree(tr.getLeft(), min, tr.getValue()) && isSearchTree(tr.getRight(), tr.getValue(), max);
    }
}
