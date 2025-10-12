import unit4.collectionsLib.Stack;

public class dP160E19 {
    public static int sequenceLength(Stack<Integer> s) {
        int maxLength = 1;
        int sequenceLength = 1;
        int prev = s.pop();
        while (!s.isEmpty()) {
            int current = s.pop();
            if (prev - 1 == current) {
                sequenceLength++;
                if (maxLength < sequenceLength) {
                    maxLength = sequenceLength;
                }
            }
            else {
                sequenceLength = 1;
            }
            prev = current;
        }

        return maxLength;
    }
}
