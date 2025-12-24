import unit4.collectionsLib.DoubleSidedNode;

public class dP129E60 {
    public boolean isPalindrome(DoubleSidedNode<Character> lst) {
        if (lst == null || lst.getNext() == null) return true;
        DoubleSidedNode<Character> tail = lst;
        while (tail.hasNext()) {
            tail = tail.getNext();
        }

        DoubleSidedNode<Character> left = lst;
        DoubleSidedNode<Character> right = tail;
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
