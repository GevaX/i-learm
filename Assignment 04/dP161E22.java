import unit4.collectionsLib.Stack;

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
}

public class dP161E22 {
    public static int found(Stack<Domino> heap, Domino stone) {
        int x = stone.getX();
        int y = stone.getY();
        int foundX = 0;
        int foundY = 0;
        Stack<Domino> temp = new Stack<>();

        while (!heap.isEmpty() && ((foundX < 1 || foundY < 1))) {
            Domino d = heap.pop();

            if (d.getX() == x) foundX++;
            if (d.getY() == x) foundX++;
            if (d.getX() == y) foundY++;
            if (d.getY() == y) foundY++;
            temp.push(d);
        }

        while (!temp.isEmpty()) {
            heap.push(temp.pop());
        }

        if (foundX > 0 && foundY > 0) return 2;
        if (foundX > 0 || foundY > 0) return 1;
        return 0;
    }
    // Time complexity: O(n)
}
