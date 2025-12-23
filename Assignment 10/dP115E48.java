import unit4.collectionsLib.Node;

class Domino {
    private int x;
    private int y;

    public Domino(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }
    public int getY() {
        return y;
    }
    public void setX(int x) {
        this.x = x;
    }
    public void setY(int y) {
        this.y = y;
    }

    public boolean isOn(int n) {
        return n == x || n == y;
    }
}

public class dP115E48 {
    public static int attachmentCases(Node<Domino> d, Domino target) {
        int c = 0;
        Node<Domino> p = d;
        
        while (p != null) {
            Domino v = p.getValue();
            if (v.isOn(target.getX()) || v.isOn(target.getY())) {
                c++;
            }
            p = p.getNext();
        }
        
        return c;
    }
}
