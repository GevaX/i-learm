import unit4.collectionsLib.Node;

public class MyStack<T> {
    private Node<T> head;
    
    public MyStack() {
        head = null;
    }

    public void push(T value) {
        Node<T> newNode = new Node<>(value, head);
        head = newNode;
    }

    public T pop() {
        T x = head.getValue();
        head = head.getNext();
        return x;
    }

    public T top() {
        return head.getValue();
    }

    public boolean isEmpty() {
        return head == null;
    }
}
