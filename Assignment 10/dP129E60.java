import unit4.collectionsLib.DSNode;

public class dP129E60 {
    public boolean isPalindrome(DSNode<Character> lst) {
        if (lst == null || lst.getNext() == null) return true;
        DSNode<Character> tail = lst;
        while (tail.hasNext()) {
            tail = tail.getNext();
        }

        DSNode<Character> left = lst;
        DSNode<Character> right = tail;
        while (left != right && left.getPrev() != right) {
            if (left.getValue() != right.getValue()) {
                return false;
            }
            left = left.getNext();
            right = right.getPrev();
        }
        return true;
    }
    // Time complexity: O(n) + O(n/2) = O(n)
}
