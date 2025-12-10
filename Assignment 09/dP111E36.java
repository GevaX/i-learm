import unit4.collectionsLib.Node;

public class dP111E36 {
    // a
    public static Node<Integer> sort(Node<Integer> lst) {
        if (lst == null || !lst.hasNext()) {
            return lst;
        }
        Node<Integer> mid = getMiddle(lst);
        Node<Integer> midNext = mid.getNext();
        mid.setNext(null);

        Node<Integer> left = sort(lst);
        Node<Integer> right = sort(midNext);
        return merge(left, right);
    }

    private static Node<Integer> merge(Node<Integer> lst1, Node<Integer> lst2) {
        Node<Integer> dummy = new Node<>(0);
        Node<Integer> tail = dummy;
        
        Node<Integer> p1 = lst1;
        Node<Integer> p2 = lst2;
        while (p1 != null && p2 != null) {
            if (p1.getValue() <= p2.getValue()) {
                tail.setNext(p1);
                p1 = p1.getNext();
            }
            else {
                tail.setNext(p2);
                p2 = p2.getNext();
            }
            tail = tail.getNext();
        }

        tail.setNext(p1 != null ? p1 : p2);

        return dummy.getNext();
    }

    private static Node<Integer> getMiddle(Node<Integer> lst) {
        Node<Integer> slow = lst;
        Node<Integer> fast = lst.getNext();

        while (fast != null && fast.hasNext()) {
            slow = slow.getNext();
            fast = fast.getNext().getNext();
        }
        return slow;
    }

    // b: It is not possible to write the function as a void because
    // it will be impossible to change the head of the list as the function
    // receives a copy of the refrence to the head and cannot directly modify it.
}
