import unit4.collectionsLib.Queue;
import unit4.collectionsLib.Stack;

public class dP176E7 {
    public static Stack<Integer> sortIntosStack(Queue<Integer> queue) {
        Stack<Integer> stack = new Stack<>();
        Queue<Integer> aux = new Queue<>();
        
        while (!queue.isEmpty()) {
            int min = queue.head();

            while (!queue.isEmpty()) {
                int e = queue.remove();
                if (e < min) {
                    min = e;
                }
                aux.insert(e);
            }

            while (!aux.isEmpty()) {
                int e = aux.remove();
                if (e == min) {
                    stack.push(e);
                }
                else {
                    queue.insert(e);
                }
            }
        }
        return stack;
    }
}
