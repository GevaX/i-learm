import unit4.collectionsLib.BinNode;

public class dP207E30 {
    // a: "a b e q"
    // b: Print the root of the tree, the entire left string of the left subtree, and the entire right string of the right subtree.
    // c: O(n)
    // d:
    public static void printIterative(BinNode<Character> t) {
        BinNode<Character> left = t.getLeft();
        BinNode<Character> right = t.getRight();

        System.out.println(t.getValue());
        while (left != null) {
            System.out.println(left.getValue());
            left = left.getLeft();
        }
        while (right != null) {
            System.out.println(right.getValue());
            right = right.getRight();
        }
    }
}
