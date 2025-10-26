import unit4.collectionsLib.Stack;

public class dP147E8 {
    public static boolean areSimilar(Stack<Integer> s1, Stack<Integer> s2) {
        Stack<Integer> temp1 = new Stack<>();
        Stack<Integer> temp2 = new Stack<>();
        boolean similar = true;
        int c1 = 0;
        int c2 = 0;

        // Check s2 size
        while (!s2.isEmpty()) {
            temp2.push(s2.pop());
            c2++;
        }
        while (!temp2.isEmpty()) {
            s2.push(temp2.pop());
        }

        while (!s1.isEmpty() && similar) {
            int e = s1.pop();
            temp1.push(e);
            c1++;

            boolean found = false;
            while (!s2.isEmpty() && !found) {
                int e2 = s2.pop();
                temp2.push(e2);
                if (e == e2) found = true;
            }

            while (!temp2.isEmpty()) {
                s2.push(temp2.pop());
            }

            if (!found) similar = false;
        }

        while (!temp1.isEmpty()) {
            s1.push(temp1.pop());
        }

        return similar && c1 == c2;
    }
}
