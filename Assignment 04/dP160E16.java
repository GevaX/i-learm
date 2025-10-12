import unit4.collectionsLib.Stack;

public class dP160E16 {
    public static boolean match(int n, Stack<Integer> s) {
        int d1 = n / 100;
        int d2 = (n / 10) % 10;
        int d3 = n % 10;
        Stack<Integer> temp = new Stack<>();

        Integer e1 = null;
        Integer e2 = null;
        Integer e3 = null;
        boolean found = false;
        while (!s.isEmpty() && !found) {
            e3 = e2;
            e2 = e1;
            e1 = s.pop();
            temp.push(e1);

            if (e3 != null) {
                if (e1 == d1 && e2 == d2 && e3 == d3) {
                    found = true;
                }
                if (e1 == d3 && e2 == d2 && e3 == d1) {
                    found = true;
                }
            }
        }

        while (!temp.isEmpty()) {
            s.push(temp.pop());
        }
        return found;
    }
}
