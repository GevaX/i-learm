import unit4.collectionsLib.Node;

class Value {
    private char tav;
    private int num;

    public Value(char tav, int num) {
        this.tav = tav;
        this.num = num;
    }

    public char getTav() {
        return tav;
    }
    public void setTav(char tav) {
        this.tav = tav;
    }
    public int getNum() {
        return num;
    }
    public void setNum(int num) {
        this.num = num;
    }
}

public class dP115E49 {
    public static Node<Character> createList(Node<Value> lst) {
        Node<Character> res = null;
        Node<Character> tail = null;
        Node<Value> p = lst;

        while (p != null) {
            Value v = p.getValue();
            int n = v.getNum();
            char c = v.getTav();
            for (int i = 0; i < n; i++) {
                Node<Character> newNode = new Node<>(c);
                if (res == null) {
                    res = newNode;
                    tail = res;
                }
                else {
                    tail.setNext(newNode);
                    tail = newNode;
                }
            }
            p = p.getNext();
        }
        
        return res;
    }
}
