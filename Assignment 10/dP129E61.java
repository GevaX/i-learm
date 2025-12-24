import unit4.collectionsLib.DoubleSidedNode;

public class dP129E61 {
    // Standart slow-fast meathod
    // From dP111E36.java
    public static <T> DoubleSidedNode<T> getMiddleS(DoubleSidedNode<T> lst) {
        DoubleSidedNode<T> slow = lst;
        DoubleSidedNode<T> fast = lst;

        while (fast != null && fast.hasNext()) {
            slow = slow.getNext();
            fast = fast.getNext().getNext();
        }
        return slow;
    }
    // Time complexity: O(n/2) = O(n)

    // Doubly linked inward meathod
    public static <T> DoubleSidedNode<T> getMiddleD(DoubleSidedNode<T> lst) {
        if (lst == null || lst.getNext() == null) return lst; // empty or single node
        DoubleSidedNode<T> tail = lst;
        while (tail.hasNext()) {
            tail = tail.getNext();
        }

        DoubleSidedNode<T> left = lst;
        DoubleSidedNode<T> right = tail;
        while (left != right && left.getPrev() != right) {
            left = left.getNext();
            right = right.getPrev();
        }
        return left;
    }
    // Time complexity: O(n) + O(n/2) = O(n)
}
