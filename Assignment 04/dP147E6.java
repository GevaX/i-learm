import unit4.collectionsLib.Stack;

public class dP147E6 {
    public static void rotate(Stack<Integer> s) {
        Stack<Integer> temp  = new Stack<>();
        int top = s.pop();

        while (!s.isEmpty()) {
            temp.push(s.pop());
        }
        s.push(top);
        while (!temp.isEmpty()) {
            s.push(temp.pop());
        }
    }
}
