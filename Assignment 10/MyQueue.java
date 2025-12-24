import unit4.collectionsLib.Node;

public class MyQueue<T> {
    private Node<T> head;
    private Node<T> tail;

    public MyQueue() {
        head = null;
        tail = null;
    }

    public void insert(T value) {
        Node<T> newNode = new Node<>(value);
        if (head == null) {
            head = newNode;
            tail = head;
        }
        else {
            tail.setNext(newNode);
            tail = newNode;
        }
    }

    public T remove() {
        T x = head.getValue();
        head = head.getNext();
        if (head == null) tail = null;
        return x;
    }

    public T head() {
        return head.getValue();
    }

    public boolean isEmpty() {
        return head == null;
    }
}
