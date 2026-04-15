import unit4.collectionsLib.Stack;

class Ring {
    private String size; // גודל הטבעת
    private int color; // צבע הטבעת

    public Ring() {
        this.size = "L";
        this.color = 0;
    }

    public Ring(String str, int c) {
        this.size = str;
        this.color = c;
    }

    public String getSize() {
        return this.size;
    }

    public int getColor() {
        return this.color;
    }
}

class Pole {
    Stack<Ring> rings;

    public Pole() {
        rings = new Stack<>();
    }

    public void add(Ring r) {
        rings.push(r);
    }

    public Ring remove() {
        return rings.pop();
    }

    public boolean isEmpty() {
        return rings.isEmpty();
    }

    public void sort() {
        Stack<Ring> temp = new Stack<>();
        Stack<Ring> sStack = new Stack<>();

        while (!rings.isEmpty()) {
            Ring r = rings.pop();
            if (r.getSize().equals("S")) {
                sStack.push(r);
            } else {
                temp.push(r);
            }
        }

        while (!sStack.isEmpty()) {
            rings.push(sStack.pop());
        }

        while (!temp.isEmpty()) {
            rings.push(temp.pop());
        }
    }
    // Time complexity: O(n), each element is pushed and popped a constant number of
    // times.
}