import unit4.collectionsLib.Stack;

class Couple {
    private int num;
    private int appears;

    public Couple(int num, int appears) {
        this.num = num;
        this.appears = appears;
    }

    public int getAppears() {
        return appears;
    }

    public int getNum() {
        return num;
    }

    public void setAppears(int appears) {
        this.appears = appears;
    }

    public void setNum(int num) {
        this.num = num;
    }
}

public class dP160E20 {
    public static Stack<Integer> buildStack(Stack<Couple> s) {
        Stack<Couple> sorted = new Stack<>();
        Stack<Integer> output = new Stack<>();

        while (!s.isEmpty()) {
            Couple e = s.pop();
            while (!sorted.isEmpty() && sorted.top().getNum() > e.getNum()) {
                s.push(sorted.pop());
            }
            sorted.push(e);
        }
        while (!sorted.isEmpty()) {
            Couple e = sorted.pop();
            for (int i = 0; i < e.getAppears(); i++) {
                output.push(e.getNum());
            }
        }
        return output;
    }
    // Time complexity: O(n^2 + m)
}
