import unit4.collectionsLib.DoubleSidedNode;

public class dP129E64 {
    public static void insertAtMiddle(DoubleSidedNode<Integer> lst1, DoubleSidedNode<Integer> lst2) {
        // Find middle
        DoubleSidedNode<Integer> slow = lst1;
        DoubleSidedNode<Integer> fast = lst1.getNext();

        while (fast != null && fast.hasNext()) {
            slow = slow.getNext();
            fast = fast.getNext().getNext();
        } // slow is the first middle

        // Insert list after slow
        DoubleSidedNode<Integer> after = slow.getNext();
        slow.setNext(lst2);
        lst2.setPrev(slow);

        // Move to end of lst2
        DoubleSidedNode<Integer> tail = lst2;
        while (tail.hasNext()) {
            tail = tail.getNext();
        }

        tail.setNext(after);
        after.setPrev(tail);
    }
    // Time complexity: O(n1/2) + O(1) + O(n2) + O(1) = O(n + m)
    // Where n is the length of lst1 and m is the length of lst2
}
