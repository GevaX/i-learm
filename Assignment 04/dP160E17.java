import unit4.collectionsLib.Stack;

public class dP160E17 {
    // a - iterative
    public static int removeMin(Stack<Integer> s) {
        Stack<Integer> temp = new Stack<>();
        int min = s.top();

        while (!s.isEmpty()) {
            int e = s.pop();
            if (e < min) {
                min = e;
            }
            temp.push(e);
        }

        boolean minRemoved = false;
        while (!temp.isEmpty()) {
            int v = temp.pop();
            if (v == min && !minRemoved) {
                minRemoved = true;
            }
            else {
                s.push(v);
            }
        }
        return min;
    }
    // a - recursive
    public static int removeMinR(Stack<Integer> s) {
        int top = s.pop();
        if (s.isEmpty()) {
            return top;
        }

        int min = removeMinR(s);
        if (top < min) {
            s.push(min);
            return top;
        }
        else {
            s.push(top);
            return min;
        }
    }

    // b
    public static void sort(Stack<Integer> s) {
        Stack<Integer> temp = new Stack<>();
        while (!s.isEmpty()) { // O(n)
            temp.push(removeMin(s)); // O(n)
        }
        while (!temp.isEmpty()) { // O(n)
            s.push(temp.pop()); // O(1)
        }
    }
    // Time complexity = O(n) * O(n) + O(n) * O(1) = O(n^2) + O(n) = O(n^2)
}
