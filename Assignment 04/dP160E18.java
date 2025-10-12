import unit4.collectionsLib.Stack;

public class dP160E18 {
    public static void decrypt(String str) {
        Stack<Character> temp = new Stack<>();
        Stack<Character> s = new Stack<>();

        for (int i = 1; i <= str.length(); i++) {
            temp.push(str.charAt(i - 1));
            if (i % 5 == 0) {
                while (!temp.isEmpty()) {
                    s.push(temp.pop());
                }
            }
        }
        while (!temp.isEmpty()) {
            s.push(temp.pop());
        }
        
        Stack<Character> output = new Stack<>();
        while (!s.isEmpty()) {
            output.push(s.pop());
        }

        while (!output.isEmpty()) {
            System.out.print(output.pop());
        }
    }
}
