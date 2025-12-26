import unit4.collectionsLib.DSNode;

public class dP129E64 {
    public static void insertAtMiddle(DSNode<Integer> lst1, DSNode<Integer> lst2) {
        // Find middle
        DSNode<Integer> slow = lst1;
        DSNode<Integer> fast = lst1.getNext();

        while (fast != null && fast.hasNext()) {
            slow = slow.getNext();
            fast = fast.getNext().getNext();
        } // slow is the first middle

        // Insert list after slow
        DSNode<Integer> after = slow.getNext();
        slow.setNext(lst2);
        lst2.setPrev(slow);

        // Move to end of lst2
        DSNode<Integer> tail = lst2;
        while (tail.hasNext()) {
            tail = tail.getNext();
        }

        tail.setNext(after);
        after.setPrev(tail);
    }
    // Time complexity: O(n1/2) + O(1) + O(n2) + O(1) = O(n + m)
    // Where n is the length of lst1 and m is the length of lst2
}
