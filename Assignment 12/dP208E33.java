import unit4.collectionsLib.BinNode;
import unit4.collectionsLib.Node;

class Pair {
    private int count;
    private int value;

    public Pair(int count, int value) {
        this.count = count;
        this.value = value;
    }

    public int getCount() {
        return count;
    }
    public void setCount(int count) {
        this.count = count;
    }
    public int getValue() {
        return value;
    }
    public void setValue(int value) {
        this.value = value;
    }
}

public class dP208E33 {
    public static Node<Pair> treeToList(BinNode<Integer> root) {
        return buildList(root, null);
    }

    private static Node<Pair> buildList(BinNode<Integer> tr, Node<Pair> lst) {
        if (tr == null) {
            return lst;
        }

        lst = addOrUpdate(lst, tr.getValue());
        lst = buildList(tr.getLeft(), lst);
        lst = buildList(tr.getRight(), lst);

        return lst;
    }

    private static Node<Pair> addOrUpdate(Node<Pair> head, int value) {
        Node<Pair> curr = head;

        while (curr != null) {
            if (curr.getValue().getValue() == value) {
                Pair p = curr.getValue();
                p.setCount(p.getCount() + 1);
                return head;
            }
            curr = curr.getNext();
        }

        // new value
        return new Node<Pair>(new Pair(value, 1), head);
    }
}
