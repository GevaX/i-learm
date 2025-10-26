import unit4.collectionsLib.Stack;

public class dP147E5 {
    public static boolean isAscendingOrder(Stack<Integer> s) {
        Stack<Integer> temp = new Stack<>();
        boolean sorted = true;
        int prev = s.pop();
        temp.push(prev);

        while (!s.isEmpty()) {
            int current = s.pop();
            temp.push(current);

            if (current < prev) {
                sorted = false;
            }
            prev = current;
        }

         while (!temp.isEmpty()) {
            s.push(temp.pop());
        }
        return sorted;
    }
}
